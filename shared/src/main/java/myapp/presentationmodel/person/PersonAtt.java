package myapp.presentationmodel.person;

import myapp.presentationmodel.PMDescription;
import myapp.util.AttributeDescription;
import myapp.util.ValueType;

/**
 * todo: Describe all your application specific PresentationModel-Attributes like this
 */
// enum  definiert eine Menge von einer Konstante
// Hauptgrund für enums: Values Methode --> alle Attribute können als Array zurückgegeben werden

public enum PersonAtt implements AttributeDescription {
    ID(ValueType.ID),
    NAME(ValueType.STRING),
    AGE(ValueType.INT),
    IS_ADULT(ValueType.BOOLEAN);

    private final ValueType valueType;

    PersonAtt(ValueType type) {
        valueType = type;
    }

    @Override
    public ValueType getValueType() {
        return valueType;
    }

    @Override
    public PMDescription getPMDescription() {
        return PMDescription.PERSON;
    }
}
