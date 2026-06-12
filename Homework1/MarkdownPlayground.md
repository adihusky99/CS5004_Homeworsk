# Markdown Playground

Use this file to add example markdown elements you learned about by reading the markdown resources below. You need to add at least 3 different markdown elements you learned about, and a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that here). 

Mermaid is a markdown language that allows you to create diagrams. You can find more information about mermaid in the resources below. It has become popular enough that github has included it as an option in their markdown.  For built in markdown readers, such as the one built into IntelliJ or VSCode, you may need to install a plugin to render the mermaid diagrams. 

> [!NOTE]
> [IntelliJ Mermaid Plugin](https://plugins.jetbrains.com/plugin/20146-mermaid). Also for intelliJ, this is often installed by default, but incase it isn't [Markdown Plugin IntelliJ](https://plugins.jetbrains.com/plugin/7793-markdown). 

> [!NOTE] 
> [VS Code Mermaid Preview](https://marketplace.visualstudio.com/items?itemName=bierner.markdown-mermaid). Markdown preview is enabled by default, but if you want the full github flavored markdown, [Github Styling Preview](https://marketplace.visualstudio.com/items?itemName=bierner.markdown-preview-github-styles) is popular. 


## Markdown Resources

* [Markdown Guide](https://www.markdownguide.org/basic-syntax/)
* [Github Flavored Markdown](https://guides.github.com/features/mastering-markdown/)
* [Github Markdown Getting Started](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
* [Mermaid Syntax Reference](https://mermaid.js.org/intro/syntax-reference.html) 


<!-- start your playground code under this dashed line -->
----

## 1. Headings

Markdown supports six levels of headings using `#` symbols.

# Heading 1
## Heading 2
### Heading 3
#### Heading 4
##### Heading 5
###### Heading 6

---

## 2. Text Formatting

You can make text **bold**, *italic*, or ***bold and italic***. You can also ~~strikethrough~~ text, and write `inline code` using backticks.

---

## 3. Ordered and Unordered Lists

Unordered list:
* Apples
* Bananas
* Cherries
  * Bing Cherries
  * Rainier Cherries

Ordered list:
1. First item
2. Second item
3. Third item

---

## 4. Blockquote

> "Any fool can write code that a computer can understand. Good programmers write code that humans can understand."
> — Martin Fowler

---

## 5. Table

| Language | Greeting  | Locality |
|----------|-----------|----------|
| English  | Hello     | USA      |
| Hawaiian | Aloha     | Hawaii   |
| Chinese  | Ni Hao    | China    |
| Italian  | Ciao      | Italy    |

---

## 6. Code Block

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

---

## 7. Mermaid Class Diagram

```mermaid
classDiagram
    class AlohaWorld {
        -AlohaWorld()
        +main(String[] args)$
    }
    class Greeter {
        -String name
        -int locality
        -List~String~ localityList$
        -int HAWAII$
        -int CHINA$
        -int ITALY$
        -int DEFAULT_LOCALITY$
        +Greeter(String name)
        +Greeter(String name, int locality)
        +getName() String
        +getLocality() int
        +setLocality(int locality) void
        +greet() String
        +greet(boolean asciiOnly) String
        +hashCode() int
        +equals(Object obj) boolean
        +toString() String
        +getLocalityList()$ List~String~
    }
    class ConsoleView {
        -Scanner SCANNER$
        -List~String~ LOCALITY_OPTIONS$
        -ConsoleView()
        +getName()$ String
        +getLocality()$ int
        +checkRunAgain()$ boolean
        +printGreeting(String greeting)$ void
    }
    AlohaWorld ..> ConsoleView : uses
    AlohaWorld ..> Greeter : creates
    ConsoleView ..> Greeter : uses
```