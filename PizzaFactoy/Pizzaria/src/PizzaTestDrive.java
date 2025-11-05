public class PizzaTestDrive {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Pizzaria de Nova York!\n");
        
        PizzaStore nyStore = new NYStylePizzaStore();
        
        // Pedindo uma pizza de queijo
        System.out.println("=== Pedido 1: Pizza de Queijo ===");
        Pizza pizza = nyStore.orderPizza("queijo");
        System.out.println("Pedido pronto: " + pizza.getName() + "\n");
        
        // Pedindo uma pizza de mariscos
        System.out.println("=== Pedido 2: Pizza de Mariscos ===");
        Pizza pizza2 = nyStore.orderPizza("mariscos");
        System.out.println("Pedido pronto: " + pizza2.getName() + "\n");
        
        // Pedindo uma pizza de calabresa
        System.out.println("=== Pedido 3: Pizza de Calabresa ===");
        Pizza pizza3 = nyStore.orderPizza("calabresa");
        System.out.println("Pedido pronto: " + pizza3.getName() + "\n");
        
        // Tentando pedir um sabor que não existe
        System.out.println("=== Pedido 4: Sabor Inexistente ===");
        try {
            Pizza pizza4 = nyStore.orderPizza("portuguesa");
            System.out.println("Pedido pronto: " + pizza4.getName() + "\n");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage() + "\n");
        }
        
        System.out.println("Obrigados por escolher a Pizzaria de Nova York!");
    }
}