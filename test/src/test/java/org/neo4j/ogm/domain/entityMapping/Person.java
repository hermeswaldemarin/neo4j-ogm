/*
 * Copyright (c) 2002-2017 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with
 * separate copyright notices and license terms. Your use of the source
 * code for these subcomponents is subject to the terms and
 *  conditions of the subcomponent's license, as noted in the LICENSE file.
 */

package org.neo4j.ogm.domain.entityMapping;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 * @author vince
 */
@NodeEntity(label = "Person")
public class Person extends Entity {

    @Relationship(type = "RATED", direction = Relationship.OUTGOING)
    public List<Rating> movieRatings = new ArrayList<>();

    @Relationship(type = "LIKES", direction = Relationship.OUTGOING)
    public List<Person> peopleILike = new ArrayList<>();

    @Relationship(type = "LIKES", direction = Relationship.INCOMING)
    public List<Person> peopleWhoLikeMe = new ArrayList<>();

    @Relationship(type = "FOLLOWS", direction = Relationship.OUTGOING)
    public List<Person> peopleIFollow = new ArrayList<>();

    @Relationship(type = "FOLLOWS", direction = Relationship.INCOMING)
    public List<Person> peopleWhoFollowMe = new ArrayList<>();
}
