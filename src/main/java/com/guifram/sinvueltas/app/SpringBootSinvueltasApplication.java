package com.guifram.sinvueltas.app;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSinvueltasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSinvueltasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Esto se ejecuta");
		if (false) {
			String url = "https://www.inmuebles24.com/propiedades/oportunidad!-penthouse-en-venta-lope-de-vega-polanco-vw-54539199.html";
			print("Fetching %s...", url);

			Document doc = Jsoup.connect(url).get();

			// contenedor principal
			Element main_content = doc.getElementById("main-container");

			// contenedor sidebar
			Element sidebar_container = main_content.getElementById("sidebar-container");

			// contenedor multimedia tabs (fotos)
			Element multimedia_container = main_content.getElementById("main-multimedia-tabs");

			// contenedor propiedades del inmueble
			Element inmueble_container = main_content.getElementById("article-container");

			// ***************Atributos del inmueble****************

			Elements atributosInm = main_content
					.getElementsByClass("general-section article-section article-section-description");

			for (Element element : atributosInm) {
				String titulo = element.getElementsByClass("section-title").text();
				System.out.println("Titulo: " + titulo);

				String descripcion = element.getElementById("verDatosDescripcion").ownText();
				System.out.println("Descripción: " + descripcion);

			}

			Elements features = main_content.getElementsByClass("icon-feature");

			for (Element element : features) {
				System.out.println("feature: " + element.text());
			}

			Elements photos = main_content.getElementsByClass("slide-content");

			Elements media = photos.select("[data-flickity-lazyload]");

			System.out.println("Size media: " + media.size());
			;
			// recupera todas las fotos del anuncio

			for (Element element : media) {
				if (element.tagName().equals("img"))
					print(" * %s: <%s> %sx%s (%s)", element.tagName(), element.attr("abs:data-flickity-lazyload"),
							element.attr("width"), element.attr("height"), trim(element.attr("alt"), 20));
				else
					print(" * %s: <%s>", element.tagName(), element.attr("abs:src"));

			}

			// recupera el tipo de operacion Venta/Renta
			Elements tipoOperacion = sidebar_container.getElementsByClass("price-operation");
			// System.out.println("Tipo de Operación: " + tipoOperacion.text());

			// recupera el precio
			Elements precio = sidebar_container.getElementsByClass("price-items");
			// System.out.println("Precio: " + precio.text());
		}
	}

	private static void print(String msg, Object... args) {
		System.out.println(String.format(msg, args));
	}

	private static String trim(String s, int width) {
		if (s.length() > width)
			return s.substring(0, width - 1) + ".";
		else
			return s;
	}

}
