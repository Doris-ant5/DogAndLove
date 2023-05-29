package org.dog.spring.api.model;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.LinkRelation;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ImageProcessor implements RepresentationModelProcessor<EntityModel<Image>> {

    @Override
    public EntityModel<Image> process(EntityModel<Image> model) {
        model.add(
                Link.of("/payments/{orderId}").withRel(LinkRelation.of("payments")) //
                        .expand(model.getContent().getId()));
        return model;
    }
}

