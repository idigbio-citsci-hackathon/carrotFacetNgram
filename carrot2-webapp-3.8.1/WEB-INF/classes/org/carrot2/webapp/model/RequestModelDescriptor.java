

// APT-generated file.

package org.carrot2.webapp.model;

//Imported for JavaDoc references mostly.
import org.carrot2.util.attribute.*;

import java.util.*;
import javax.annotation.*;

/**
 * Metadata and attributes of the {@link org.carrot2.webapp.model.RequestModel} component. You can use 
 * this descriptor to obtain metadata, such as human readable name and description, about the component 
 * as a whole as well as about its attributes. Using the {@link #attributeBuilder(Map)}
 * you can obtain a builder for type-safe generation of the attribute maps. Please see the
 * <a href="{@docRoot}/overview-summary.html#setting-attributes">main overview</a> for a complete code example. 
 */
@Generated("Generated from org.carrot2.webapp.model.RequestModel")
public final class RequestModelDescriptor implements IBindableDescriptor
{
    /**
     * The component class for which this descriptor was generated. 
     */
    public final String bindableClassName = "org.carrot2.webapp.model.RequestModel";

    /**
     * Attribute prefix used by the component.
     */
    public final String prefix = "";

    /**
     * A one sentence summary of the component. It could be presented as a header of the tool
     * tip of the corresponding UI component.
     */
    public final String title = "Represents the data the application received in the HTTP request";
    
    /**
     * A short label for the component. It can be presented as a label of the
     * corresponding UI component.
     */
    public final String label = "";

    /**
     * A longer, possibly multi sentence, description of the component. It could be presented
     * as a body of the tool tip of the corresponding UI component.
     */
    public final String description = "";

    /**
     * Attributes of the component. Note that only statically reachable fields are included.
     * Additional attributes may be available at run time. 
     */
    public final static Attributes attributes; 

    /**
     * Attributes declared directly by the component.
     */
    private final static Set<AttributeInfo> ownAttributes;

    /**
     * Attributes declared by the component or its superclasses.
     */
    private final static Set<AttributeInfo> allAttributes;

    /**
     * Attributes declared by the component or its superclasses, lookup dictionary 
     * by attribute key.
     */
    private final static Map<String, AttributeInfo> allAttributesByKey;

    /**
     * Attributes declared by the component or its superclasses, lookup dictionary by 
     * attribute's field name.
     */
    private final static Map<String, AttributeInfo> allAttributesByFieldName;

    /**
     * Static initializer for internal collections.
     */
    static
    {
        attributes = new Attributes();

        final Set<AttributeInfo> ownAttrs = new HashSet<AttributeInfo>();
        ownAttrs.add(attributes.skin);
        ownAttrs.add(attributes.query);
        ownAttrs.add(attributes.results);
        ownAttrs.add(attributes.source);
        ownAttrs.add(attributes.algorithm);
        ownAttrs.add(attributes.type);
        ownAttrs.add(attributes.view);
        ownAttrs.add(attributes.statsKey);

        final Set<AttributeInfo> allAttrs = new HashSet<AttributeInfo>();
        allAttrs.add(org.carrot2.webapp.model.RequestModelDescriptor.attributes.skin);
        allAttrs.add(org.carrot2.webapp.model.RequestModelDescriptor.attributes.query);
        allAttrs.add(org.carrot2.webapp.model.RequestModelDescriptor.attributes.results);
        allAttrs.add(org.carrot2.webapp.model.RequestModelDescriptor.attributes.source);
        allAttrs.add(org.carrot2.webapp.model.RequestModelDescriptor.attributes.algorithm);
        allAttrs.add(org.carrot2.webapp.model.RequestModelDescriptor.attributes.type);
        allAttrs.add(org.carrot2.webapp.model.RequestModelDescriptor.attributes.view);
        allAttrs.add(org.carrot2.webapp.model.RequestModelDescriptor.attributes.statsKey);

        allAttributes = Collections.unmodifiableSet(allAttrs);
        ownAttributes = Collections.unmodifiableSet(ownAttrs);
        
        final Map<String, AttributeInfo> allAttrsByKey = new HashMap<String, AttributeInfo>();
        final Map<String, AttributeInfo> allAttrsByFieldName = new HashMap<String, AttributeInfo>();
        for (AttributeInfo ai : allAttrs)
        {
            allAttrsByKey.put(ai.key, ai);
            allAttrsByFieldName.put(ai.fieldName, ai);
        }

        allAttributesByKey = Collections.unmodifiableMap(allAttrsByKey);
        allAttributesByFieldName = Collections.unmodifiableMap(allAttrsByFieldName);
    }

    
    /* Attribute keys. */

    /**
     * Constants for all attribute keys of the {@link org.carrot2.webapp.model.RequestModel} component.
     */
    public static class Keys 
    {
        protected Keys() {} 

        /** Attribute key for: {@link org.carrot2.webapp.model.RequestModel#skin}. */
        public static final String SKIN = "skin";
        /** Attribute key for: {@link org.carrot2.webapp.model.RequestModel#query}. */
        public static final String QUERY = "query";
        /** Attribute key for: {@link org.carrot2.webapp.model.RequestModel#results}. */
        public static final String RESULTS = "results";
        /** Attribute key for: {@link org.carrot2.webapp.model.RequestModel#source}. */
        public static final String SOURCE = "source";
        /** Attribute key for: {@link org.carrot2.webapp.model.RequestModel#algorithm}. */
        public static final String ALGORITHM = "algorithm";
        /** Attribute key for: {@link org.carrot2.webapp.model.RequestModel#type}. */
        public static final String TYPE = "type";
        /** Attribute key for: {@link org.carrot2.webapp.model.RequestModel#view}. */
        public static final String VIEW = "view";
        /** Attribute key for: {@link org.carrot2.webapp.model.RequestModel#statsKey}. */
        public static final String STATS_KEY = "stats.key";
    }


    /* Attribute descriptors. */

    /**
     * All attributes of the {@link org.carrot2.webapp.model.RequestModel} component.
     */
    public static final class Attributes
    {
        private Attributes() { /* No public instances. */ }

        /**
         *          */
        public final AttributeInfo skin = 
            new AttributeInfo(
                "skin",
                "org.carrot2.webapp.model.RequestModel",
                "skin",
                null,
                null,
                null,
                null,
                null,
                null,
                null
            );

        /**
         *          */
        public final AttributeInfo query = 
            new AttributeInfo(
                "query",
                "org.carrot2.webapp.model.RequestModel",
                "query",
                null,
                null,
                null,
                null,
                null,
                null,
                null
            );

        /**
         *          */
        public final AttributeInfo results = 
            new AttributeInfo(
                "results",
                "org.carrot2.webapp.model.RequestModel",
                "results",
                "Note that this is the number of results user requested, the actual number may be\ndifferent, in particular 0.",
                null,
                "Note that this is the number of results user requested, the actual number may be different, in particular 0",
                null,
                null,
                null,
                null
            );

        /**
         *          */
        public final AttributeInfo source = 
            new AttributeInfo(
                "source",
                "org.carrot2.webapp.model.RequestModel",
                "source",
                null,
                null,
                null,
                null,
                null,
                null,
                null
            );

        /**
         *          */
        public final AttributeInfo algorithm = 
            new AttributeInfo(
                "algorithm",
                "org.carrot2.webapp.model.RequestModel",
                "algorithm",
                null,
                null,
                null,
                null,
                null,
                null,
                null
            );

        /**
         *          */
        public final AttributeInfo type = 
            new AttributeInfo(
                "type",
                "org.carrot2.webapp.model.RequestModel",
                "type",
                null,
                null,
                null,
                null,
                null,
                null,
                null
            );

        /**
         *          */
        public final AttributeInfo view = 
            new AttributeInfo(
                "view",
                "org.carrot2.webapp.model.RequestModel",
                "view",
                null,
                null,
                null,
                null,
                null,
                null,
                null
            );

        /**
         *          */
        public final AttributeInfo statsKey = 
            new AttributeInfo(
                "stats.key",
                "org.carrot2.webapp.model.RequestModel",
                "statsKey",
                null,
                null,
                null,
                null,
                null,
                null,
                null
            );


    }

    /**
     * Attribute map builder for the  {@link org.carrot2.webapp.model.RequestModel} component. You can use this
     * builder as a type-safe alternative to populating the attribute map using attribute keys.
     */
    public static class AttributeBuilder 
    {
        /** The attribute map populated by this builder. */
        public final Map<String, Object> map;

        /**
         * Creates a builder backed by the provided map.
         */
        protected AttributeBuilder(Map<String, Object> map)
        {
            
            this.map = map;
        }


        
        
        /**
         * 
         * 
         * @see org.carrot2.webapp.model.RequestModel#skin 
         */
        public AttributeBuilder skin(java.lang.String value)
        {
            map.put("skin", value);
            return this;
        }
        
        
        
        
        
        /**
         * 
         * 
         * @see org.carrot2.webapp.model.RequestModel#skin 
         */
        public AttributeBuilder skin(IObjectFactory<? extends java.lang.String> value)
        {
            map.put("skin", value);
            return this;
        }
        
        
        
        
        
        /**
         * 
         * 
         * @see org.carrot2.webapp.model.RequestModel#query 
         */
        public AttributeBuilder query(java.lang.String value)
        {
            map.put("query", value);
            return this;
        }
        
        
        
        
        
        /**
         * 
         * 
         * @see org.carrot2.webapp.model.RequestModel#query 
         */
        public AttributeBuilder query(IObjectFactory<? extends java.lang.String> value)
        {
            map.put("query", value);
            return this;
        }
        
        
        
        
        
        /**
         * Note that this is the number of results user requested, the actual number may be
different, in particular 0.
         * 
         * @see org.carrot2.webapp.model.RequestModel#results 
         */
        public AttributeBuilder results(int value)
        {
            map.put("results", value);
            return this;
        }
        
        
        
        
        
        /**
         * Note that this is the number of results user requested, the actual number may be
different, in particular 0.
         * 
         * @see org.carrot2.webapp.model.RequestModel#results 
         */
        public AttributeBuilder results(IObjectFactory<? extends java.lang.Integer> value)
        {
            map.put("results", value);
            return this;
        }
        
        
        
        
        
        /**
         * 
         * 
         * @see org.carrot2.webapp.model.RequestModel#source 
         */
        public AttributeBuilder source(java.lang.String value)
        {
            map.put("source", value);
            return this;
        }
        
        
        
        
        
        /**
         * 
         * 
         * @see org.carrot2.webapp.model.RequestModel#source 
         */
        public AttributeBuilder source(IObjectFactory<? extends java.lang.String> value)
        {
            map.put("source", value);
            return this;
        }
        
        
        
        
        
        /**
         * 
         * 
         * @see org.carrot2.webapp.model.RequestModel#algorithm 
         */
        public AttributeBuilder algorithm(java.lang.String value)
        {
            map.put("algorithm", value);
            return this;
        }
        
        
        
        
        
        /**
         * 
         * 
         * @see org.carrot2.webapp.model.RequestModel#algorithm 
         */
        public AttributeBuilder algorithm(IObjectFactory<? extends java.lang.String> value)
        {
            map.put("algorithm", value);
            return this;
        }
        
        
        
        
        
        /**
         * 
         * 
         * @see org.carrot2.webapp.model.RequestModel#type 
         */
        public AttributeBuilder type(org.carrot2.webapp.model.RequestType value)
        {
            map.put("type", value);
            return this;
        }
        
        
        
        
        
        /**
         * 
         * 
         * @see org.carrot2.webapp.model.RequestModel#type 
         */
        public AttributeBuilder type(IObjectFactory<? extends org.carrot2.webapp.model.RequestType> value)
        {
            map.put("type", value);
            return this;
        }
        
        
        
        
        
        /**
         * 
         * 
         * @see org.carrot2.webapp.model.RequestModel#view 
         */
        public AttributeBuilder view(java.lang.String value)
        {
            map.put("view", value);
            return this;
        }
        
        
        
        
        
        /**
         * 
         * 
         * @see org.carrot2.webapp.model.RequestModel#view 
         */
        public AttributeBuilder view(IObjectFactory<? extends java.lang.String> value)
        {
            map.put("view", value);
            return this;
        }
        
        
        
        
        
        /**
         * 
         * 
         * @see org.carrot2.webapp.model.RequestModel#statsKey 
         */
        public AttributeBuilder statsKey(java.lang.String value)
        {
            map.put("stats.key", value);
            return this;
        }
        
        
        
        
        
        /**
         * 
         * 
         * @see org.carrot2.webapp.model.RequestModel#statsKey 
         */
        public AttributeBuilder statsKey(IObjectFactory<? extends java.lang.String> value)
        {
            map.put("stats.key", value);
            return this;
        }
        
        
        
    }

    /**
     * Creates an attribute map builder for the component. You can use this
     * builder as a type-safe alternative to populating the attribute map using attribute keys.
     * 
     * @param attributeValues An existing map which should be used to collect attribute values. 
     *        Attribute values set by this builder will be added to the provided map, overwriting
     *        previously defined mappings, if any.
     */
    public static AttributeBuilder attributeBuilder(Map<String, Object> attributeValues)
    {
        return new AttributeBuilder(attributeValues);
    }
    
    /* IBindableDescriptor */

    @Override 
    public String getPrefix()
    {
        return prefix;
    }

    @Override 
    public String getTitle()
    {
        return title;
    }
    
    @Override 
    public String getLabel()      
    { 
        return label;
    }
    
    @Override 
    public String getDescription() 
    { 
        return description; 
    }

    @Override 
    public Set<AttributeInfo> getOwnAttributes()
    { 
        return ownAttributes;
    }

    @Override 
    public Set<AttributeInfo> getAttributes()
    {
        return allAttributes;
    }

    @Override 
    public Map<String, AttributeInfo> getAttributesByKey()
    {
        return allAttributesByKey;
    }

    @Override 
    public Map<String, AttributeInfo> getAttributesByFieldName()
    {
        return allAttributesByFieldName;
    }
}
