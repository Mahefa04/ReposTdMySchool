package hei.td.myschool.endpoint.event.consumer.model;

import hei.td.myschool.PojaGenerated;
import hei.td.myschool.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
