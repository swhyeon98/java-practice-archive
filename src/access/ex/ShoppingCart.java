package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
            /**
             * 아래처럼 직접 가격 계산을 할 수도 있음.
             * 하지만, 책임과 역할을 고려하면 `getTotalPrice()`를 사용하는 것이 더 나은 설계임.
             * - 계산 로직이 분리되어 코드가 더 직관적이고 가독성이 좋음.
             * - 유지보수가 쉬워지고, 가격 계산 로직이 바뀌더라도 여러 곳을 수정할 필요 없음.
             */
//            System.out.println("상품명: " + item.getName() + " 가격: " + item.getPrice() * item.getQuantity());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
