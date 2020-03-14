
package com.example.models.response;


public class Files {

    private Simplefile simplefile;

    public Simplefile getSimplefile() {
        return simplefile;
    }

    public void setSimplefile(Simplefile simplefile) {
        this.simplefile = simplefile;
    }

    public Files withSimplefile(Simplefile simplefile) {
        this.simplefile = simplefile;
        return this;
    }

}
