# MDE_Mario_NEW

## Language Overview

The UiMockupLanguage allows you to define the structure of a user interface mockup using a simple and expressive syntax. It consists of the following main elements:

### Entities

Entities represent the main data components of your UI mockup. They are defined using the `entity` keyword, followed by the entity name and an optional `extends` clause if the entity inherits from another entity. Entities can have attributes that specify the data fields they contain.

Example:
```UiMockupLanguage
entity User {
    name: String
    age: Integer
}

entity Admin extends User {
    isAdmin: Boolean
}
```

### Screens

Screens define the different UI screens or pages of your mockup. They are associated with an entity using the `for` keyword, indicating the entity they are related to. Screens can contain widgets, which represent UI elements.

Example:
```UiMockupLanguage
screen UserList for User {
    text firstNameLabel
    text lastNameLabel
    button editButton(label: "Edit User")
}
```

### Widgets

Widgets are the UI elements that appear on screens. The supported widgets are `TextField`, `Checkbox`, and `Button`. They can have an optional `label` specified using an expression.

Example:
```UiMockupLanguage
text firstNameLabel(label: "First Name")
checkbox isAdminCheckbox(label: "Is Admin")
button saveButton
```

### Navigation

Navigation rules define how the screens are connected and when the transitions happen. A navigation rule specifies the source screen, the target screen, and an optional condition for when the navigation should occur.

Example:
```UiMockupLanguage
navigate from UserList to UserEdit
navigate from UserEdit to UserList if isAdminCheckbox.isChecked()
```

## Example Project

To illustrate the use of the UiMockupLanguage, I have created an example project in Runtime Eclipse in the `TestMockup` directory. The project showcases a simple use of the language.

Please have a look at the example project below:

1. **test.mockup**: This file contains the UiMockupLanguage code for defining  entities, screens, widgets and navigation of the testing project.

```entity User {
    name: String
    age: Integer
}

 
screen UserScreen for User {
    text firstName label "First Name:"
    text lastName label "Last Name:"
    checkbox isAdult label "Is Adult:"
    button save label "Save"
}
 

screen DashboardScreen for User {
    button edit label "Edit"
}


navigate from UserScreen to DashboardScreen when if isAdult
```

---

