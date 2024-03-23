	package tarefaMod19Reflections;
	
	import java.lang.annotation.Annotation;
	import java.lang.reflect.Field;
	
	public class App {
		public static void main(String[] args) {
			
	        if (Produto.class.isAnnotationPresent(Tabela.class)) {
	        	
	            Tabela tabelaAnnotation = Produto.class.getAnnotation(Tabela.class);
	            
	            String nomeTabela = tabelaAnnotation.nome();
	            
	            System.out.println("Nome da tabela: " + nomeTabela);
	            
	        } else {
	        	
	            System.out.println("A classe Produto não possui a anotação @Tabela!");
	            
	        }
	    }
	}
