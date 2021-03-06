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

package org.neo4j.ogm.autoindex;

import static org.junit.Assume.*;

import org.junit.BeforeClass;
import org.neo4j.ogm.domain.autoindex.Entity;
import org.neo4j.ogm.domain.autoindex.RelPropertyExistenceConstraintEntity;

/**
 * @author Frantisek Hartman
 */
public class RelPropertyExistenceConstraintAutoIndexManagerTest extends BaseAutoIndexManagerTestClass {

    public RelPropertyExistenceConstraintAutoIndexManagerTest() {
        super("CONSTRAINT ON ()-[`rel`:`REL`]-() ASSERT exists(`rel`.`description`)",
            Entity.class.getName(), RelPropertyExistenceConstraintEntity.class.getName());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        assumeTrue("This test uses existence constraint and can only be run on enterprise edition",
            isEnterpriseEdition());
    }
}
