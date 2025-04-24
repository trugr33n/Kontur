package com.monolatte.kontur.model;

import com.monolatte.kontur.service.ValueValidator;

public class ElectComponent {
    private final int _id;
    private String _name;
    private String _type;
    private double _price;
    private String _information;
    private String _datasheetPath;

    private static int _nextId = 0;

    public ElectComponent(String name, String type, double price, String info, String datasheetPath) {
        this._id = _nextId;
        this._name = name;
        this._type = type;
        this._price = price;
        this._information = info;
        this._datasheetPath = datasheetPath;

        _nextId++;
    }

    public int getId() { return this._id; }
    public void setName(String name) throws Exception {
        this._name = ValueValidator.checkStringValue(
                name,
                100,
                "Введенный текст превышает лимит символов!"
        );
    }
    public String getName() { return this._name; }
    public void setType(String type) throws Exception {
        this._type = ValueValidator.checkStringValue(
                type,
                100,
                "Введенный текст превышает лимит символов!"
        );
    }
    public String getType() { return this._type; }
    public void setPrice(double price) { this._price = price; }
    public double getPrice() { return this._price; }
    public void setInformation(String info) throws Exception {
        this._information = ValueValidator.checkStringValue(
                info,
                3000,
                "Введенный текст превышает лимит символов!"
        );
    }
    public String getInformation() { return this._information; }
    public void setDatasheet(String path) { this._datasheetPath = path; }
    public String getDatasheet() { return this._datasheetPath; }

}
