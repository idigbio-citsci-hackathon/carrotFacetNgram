

// APT-generated file.

package org.carrot2.webapp.filter;

//Imported for JavaDoc references mostly.
import org.carrot2.util.attribute.*;

import java.util.*;
import javax.annotation.*;

/**
 * Metadata and attributes of the {@link org.carrot2.webapp.filter.QueryWordHighlighter} component. You can use 
 * this descriptor to obtain metadata, such as human readable name and description, about the component 
 * as a whole as well as about its attributes. Using the {@link #attributeBuilder(Map)}
 * you can obtain a builder for type-safe generation of the attribute maps. Please see the
 * <a href="{@docRoot}/overview-summary.html#setting-attributes">main overview</a> for a complete code example. 
 */
@Generated("Generated from org.carrot2.webapp.filter.QueryWordHighlighter")
public final class QueryWordHighlighterDescriptor implements IBindableDescriptor
{
    /**
     * The component class for which this descriptor was generated. 
     */
    public final String bindableClassName = "org.carrot2.webapp.filter.QueryWordHighlighter";

    /**
     * Attribute prefix used by the component.
     */
    public final String prefix = "";

    /**
     * A one sentence summary of the component. It could be presented as a header of the tool
     * tip of the corresponding UI component.
     */
    public final String title = "Highlights query words in documents using the &lt;b&gt; HTML tag";
    
    /**
     * A short label for the component. It can be presented as a label of the
     * corresponding UI component.
     */
    public final String label = "";

    /**
     * A longer, possibly multi sentence, description of the component. It could be presented
     * as a body of the tool tip of the corresponding UI component.
     */
    public final String description = "Highlighting is performed on the fields specified in <code>org.carrot2.webapp.filter.QueryWordHighlighter.fields</code>, the results are saved in fields with names suffixed by <code>org.carrot2.webapp.filter.QueryWordHighlighter.HIGHLIGHTED_FIELD_NAME_SUFFIX</code>.";

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
        ownAttrs.add(attributes.enabled);
        ownAttrs.add(attributes.dontHighlightPattern);
        ownAttrs.add(attributes.querySanitizePattern);
        ownAttrs.add(attributes.query);
        ownAttrs.add(attributes.documents);
        ownAttrs.add(attributes.fields);

        final Set<AttributeInfo> allAttrs = new HashSet<AttributeInfo>();
        allAttrs.add(org.carrot2.webapp.filter.QueryWordHighlighterDescriptor.attributes.enabled);
        allAttrs.add(org.carrot2.webapp.filter.QueryWordHighlighterDescriptor.attributes.dontHighlightPattern);
        allAttrs.add(org.carrot2.webapp.filter.QueryWordHighlighterDescriptor.attributes.querySanitizePattern);
        allAttrs.add(org.carrot2.webapp.filter.QueryWordHighlighterDescriptor.attributes.query);
        allAttrs.add(org.carrot2.webapp.filter.QueryWordHighlighterDescriptor.attributes.documents);
        allAttrs.add(org.carrot2.webapp.filter.QueryWordHighlighterDescriptor.attributes.fields);

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
     * Constants for all attribute keys of the {@link org.carrot2.webapp.filter.QueryWordHighlighter} component.
     */
    public static class Keys 
    {
        protected Keys() {} 

        /** Attribute key for: {@link org.carrot2.webapp.filter.QueryWordHighlighter#enabled}. */
        public static final String ENABLED = "QueryWordHighlighter.enabled";
        /** Attribute key for: {@link org.carrot2.webapp.filter.QueryWordHighlighter#dontHighlightPattern}. */
        public static final String DONT_HIGHLIGHT_PATTERN = "QueryWordHighlighter.dontHighlightPattern";
        /** Attribute key for: {@link org.carrot2.webapp.filter.QueryWordHighlighter#querySanitizePattern}. */
        public static final String QUERY_SANITIZE_PATTERN = "QueryWordHighlighter.querySanitizePattern";
        /** Attribute key for: {@link org.carrot2.webapp.filter.QueryWordHighlighter#query}. */
        public static final String QUERY = "query";
        /** Attribute key for: {@link org.carrot2.webapp.filter.QueryWordHighlighter#documents}. */
        public static final String DOCUMENTS = "documents";
        /** Attribute key for: {@link org.carrot2.webapp.filter.QueryWordHighlighter#fields}. */
        public static final String FIELDS = "org.carrot2.webapp.filter.QueryWordHighlighter.fields";
    }


    /* Attribute descriptors. */

    /**
     * All attributes of the {@link org.carrot2.webapp.filter.QueryWordHighlighter} component.
     */
    public static final class Attributes
    {
        private Attributes() { /* No public instances. */ }

        /**
         *          */
        public final AttributeInfo enabled = 
            new AttributeInfo(
                "QueryWordHighlighter.enabled",
                "org.carrot2.webapp.filter.QueryWordHighlighter",
                "enabled",
                "Enable or disable query highlighter.",
                null,
                "Enable or disable query highlighter",
                null,
                null,
                null,
                null
            );

        /**
         *          */
        public final AttributeInfo dontHighlightPattern = 
            new AttributeInfo(
                "QueryWordHighlighter.dontHighlightPattern",
                "org.carrot2.webapp.filter.QueryWordHighlighter",
                "dontHighlightPattern",
                "A regular expression that disables highlighting for certain terms.",
                null,
                "A regular expression that disables highlighting for certain terms",
                null,
                null,
                null,
                null
            );

        /**
         *          */
        public final AttributeInfo querySanitizePattern = 
            new AttributeInfo(
                "QueryWordHighlighter.querySanitizePattern",
                "org.carrot2.webapp.filter.QueryWordHighlighter",
                "querySanitizePattern",
                "Query-sanitize pattern (any matches are replaced with an empty string).",
                null,
                "Query-sanitize pattern (any matches are replaced with an empty string)",
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
                "org.carrot2.webapp.filter.QueryWordHighlighter",
                "query",
                "Query that produced the documents, optional. If query is blank, no processing will\nbe performed.",
                null,
                "Query that produced the documents, optional",
                "If query is blank, no processing will be performed.",
                null,
                null,
                null
            );

        /**
         *          */
        public final AttributeInfo documents = 
            new AttributeInfo(
                "documents",
                "org.carrot2.webapp.filter.QueryWordHighlighter",
                "documents",
                "{@link org.carrot2.core.Document}s to highlight query words in.",
                null,
                "<code>org.carrot2.core.Document</code>s to highlight query words in",
                null,
                null,
                null,
                null
            );

        /**
         *          */
        public final AttributeInfo fields = 
            new AttributeInfo(
                "org.carrot2.webapp.filter.QueryWordHighlighter.fields",
                "org.carrot2.webapp.filter.QueryWordHighlighter",
                "fields",
                "Fields of the {@link org.carrot2.core.Document} that should have the query words highlighted.",
                null,
                "Fields of the <code>org.carrot2.core.Document</code> that should have the query words highlighted",
                null,
                null,
                null,
                null
            );


    }

    /**
     * Attribute map builder for the  {@link org.carrot2.webapp.filter.QueryWordHighlighter} component. You can use this
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
         * Enable or disable query highlighter.
         * 
         * @see org.carrot2.webapp.filter.QueryWordHighlighter#enabled 
         */
        public AttributeBuilder enabled(boolean value)
        {
            map.put("QueryWordHighlighter.enabled", value);
            return this;
        }
        
        
        
        
        
        /**
         * Enable or disable query highlighter.
         * 
         * @see org.carrot2.webapp.filter.QueryWordHighlighter#enabled 
         */
        public AttributeBuilder enabled(IObjectFactory<? extends java.lang.Boolean> value)
        {
            map.put("QueryWordHighlighter.enabled", value);
            return this;
        }
        
        
        
        
        
        /**
         * A regular expression that disables highlighting for certain terms.
         * 
         * @see org.carrot2.webapp.filter.QueryWordHighlighter#dontHighlightPattern 
         */
        public AttributeBuilder dontHighlightPattern(java.lang.String value)
        {
            map.put("QueryWordHighlighter.dontHighlightPattern", value);
            return this;
        }
        
        
        
        
        
        /**
         * A regular expression that disables highlighting for certain terms.
         * 
         * @see org.carrot2.webapp.filter.QueryWordHighlighter#dontHighlightPattern 
         */
        public AttributeBuilder dontHighlightPattern(IObjectFactory<? extends java.lang.String> value)
        {
            map.put("QueryWordHighlighter.dontHighlightPattern", value);
            return this;
        }
        
        
        
        
        
        /**
         * Query-sanitize pattern (any matches are replaced with an empty string).
         * 
         * @see org.carrot2.webapp.filter.QueryWordHighlighter#querySanitizePattern 
         */
        public AttributeBuilder querySanitizePattern(java.lang.String value)
        {
            map.put("QueryWordHighlighter.querySanitizePattern", value);
            return this;
        }
        
        
        
        
        
        /**
         * Query-sanitize pattern (any matches are replaced with an empty string).
         * 
         * @see org.carrot2.webapp.filter.QueryWordHighlighter#querySanitizePattern 
         */
        public AttributeBuilder querySanitizePattern(IObjectFactory<? extends java.lang.String> value)
        {
            map.put("QueryWordHighlighter.querySanitizePattern", value);
            return this;
        }
        
        
        
        
        
        /**
         * Query that produced the documents, optional. If query is blank, no processing will
be performed.
         * 
         * @see org.carrot2.webapp.filter.QueryWordHighlighter#query 
         */
        public AttributeBuilder query(java.lang.String value)
        {
            map.put("query", value);
            return this;
        }
        
        
        
        
        
        /**
         * Query that produced the documents, optional. If query is blank, no processing will
be performed.
         * 
         * @see org.carrot2.webapp.filter.QueryWordHighlighter#query 
         */
        public AttributeBuilder query(IObjectFactory<? extends java.lang.String> value)
        {
            map.put("query", value);
            return this;
        }
        
        
        
        
        
        /**
         * {@link org.carrot2.core.Document}s to highlight query words in.
         * 
         * @see org.carrot2.webapp.filter.QueryWordHighlighter#documents 
         */
        public AttributeBuilder documents(java.util.List<org.carrot2.core.Document> value)
        {
            map.put("documents", value);
            return this;
        }
        
        
        
        
        
        /**
         * {@link org.carrot2.core.Document}s to highlight query words in.
         * 
         * @see org.carrot2.webapp.filter.QueryWordHighlighter#documents 
         */
        public AttributeBuilder documents(IObjectFactory<? extends java.util.List<org.carrot2.core.Document>> value)
        {
            map.put("documents", value);
            return this;
        }
        
        
        
        /**
         * {@link org.carrot2.core.Document}s to highlight query words in.
         * 
         * @see org.carrot2.webapp.filter.QueryWordHighlighter#documents 
         */
        @SuppressWarnings("unchecked")        public java.util.List<org.carrot2.core.Document> documents()
        {
            return (java.util.List<org.carrot2.core.Document>) map.get("documents");
        }
        
        
        
        /**
         * Fields of the {@link org.carrot2.core.Document} that should have the query words highlighted.
         * 
         * @see org.carrot2.webapp.filter.QueryWordHighlighter#fields 
         */
        public AttributeBuilder fields(java.util.Collection<java.lang.String> value)
        {
            map.put("org.carrot2.webapp.filter.QueryWordHighlighter.fields", value);
            return this;
        }
        
        
        
        
        
        /**
         * Fields of the {@link org.carrot2.core.Document} that should have the query words highlighted.
         * 
         * @see org.carrot2.webapp.filter.QueryWordHighlighter#fields 
         */
        public AttributeBuilder fields(IObjectFactory<? extends java.util.Collection<java.lang.String>> value)
        {
            map.put("org.carrot2.webapp.filter.QueryWordHighlighter.fields", value);
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
