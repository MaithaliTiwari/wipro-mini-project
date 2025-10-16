
---

### 🧱 Code: `Box.java`
```java
package com.boxes;

public class Box {
    private int length;
    private int width;
    private int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Getters
    public int getLength() { return length; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }

    // Calculate Volume
    public int getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return String.format("Box(%d x %d x %d) → Volume: %d", length, width, height, getVolume());
    }

    // Ensuring uniqueness based on dimensions
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Box)) return false;
        Box other = (Box) obj;
        return this.length == other.length &&
               this.width == other.width &&
               this.height == other.height;
    }

    @Override
    public int hashCode() {
        return (length * 31 + width * 17 + height);
    }
}
