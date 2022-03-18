public class Card {

    private CardSuitType suitType;
    private CardValueType valueType;

    public Card(CardSuitType suitType, CardValueType valueType) {
        this.suitType = suitType;
        this.valueType = valueType;
    }

    public CardSuitType getSuitType() {
        return suitType;
    }

    public void setSuitType(CardSuitType suitType) {
        this.suitType = suitType;
    }

    public CardValueType getValueType() {
        return valueType;
    }

    public void setValueType(CardValueType valueType) {
        this.valueType = valueType;
    }
}
