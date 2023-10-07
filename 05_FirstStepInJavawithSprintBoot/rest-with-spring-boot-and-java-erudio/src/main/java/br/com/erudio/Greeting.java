package br.com.erudio;

public class Greeting {
		private final int id;
		private final String content;
		
		public Greeting(long id, String content) {
			this.id = (int) id;
			this.content = content;
		}

		public int getId() {
			return id;
		}

		public String getContent() {
			return content;
		}
		
}
