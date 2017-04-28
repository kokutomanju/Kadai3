package snakecamel;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void snakeToCamelcaseでgackt_satoruをキャメルケースに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "GacktSatoru";
		String actual = scu.snakeToCamelcase("gackt_satoru");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでai_kenjiをキャメルケースに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AiKenji";
		String actual = scu.snakeToCamelcase("ai_kenji");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでGacktSatoruをスネークケースに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "gackt_satoru";
		String actual = scu.camelToSnakecase("GacktSatoru");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでAiKenjiをスネークケースに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "ai_kenji";
		String actual = scu.camelToSnakecase("AiKenji");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeでgacktの一文字目を大文字に変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Gackt";
		String actual = scu.capitalize("Gackt");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeでsaiTamaの一文字目を大文字に変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "SaiTama";
		String actual = scu.capitalize("saiTama");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeでGacktの一文字目を小文字に変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "gackt";
		String actual = scu.uncapitalize("Gackt");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeでSAitamaの一文字目を小文字に変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "sAitama";
		String actual = scu.uncapitalize("SAitama");
		assertThat(actual, is(expected));
	}

}
