/*
 * Copyright 2011 JBoss Inc
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.drools.guvnor.client.asseteditor.drools.modeldriven.ui.templates.events;

import org.drools.guvnor.client.widgets.drools.decoratedgrid.events.SetModelEvent;
import org.drools.ide.common.client.modeldriven.brl.templates.TemplateModel;

/**
 * An event to set the underlying Template Data in the table
 */
public class SetTemplateDataEvent extends SetModelEvent<TemplateModel> {

    public SetTemplateDataEvent(TemplateModel model) {
        super( model );
    }

    public static Type<SetModelEvent.Handler<TemplateModel>> TYPE = new Type<SetModelEvent.Handler<TemplateModel>>();

    @Override
    public Type<SetModelEvent.Handler<TemplateModel>> getAssociatedType() {
        return TYPE;
    }

}