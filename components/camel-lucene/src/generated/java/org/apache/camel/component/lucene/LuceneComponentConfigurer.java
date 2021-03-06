/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.lucene;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class LuceneComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.lucene.LuceneConfiguration getOrCreateConfig(LuceneComponent target) {
        if (target.getConfig() == null) {
            target.setConfig(new org.apache.camel.component.lucene.LuceneConfiguration());
        }
        return target.getConfig();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        LuceneComponent target = (LuceneComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "analyzer": getOrCreateConfig(target).setAnalyzer(property(camelContext, org.apache.lucene.analysis.Analyzer.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "config": target.setConfig(property(camelContext, org.apache.camel.component.lucene.LuceneConfiguration.class, value)); return true;
        case "indexdir":
        case "indexDir": getOrCreateConfig(target).setIndexDir(property(camelContext, java.io.File.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxhits":
        case "maxHits": getOrCreateConfig(target).setMaxHits(property(camelContext, int.class, value)); return true;
        case "srcdir":
        case "srcDir": getOrCreateConfig(target).setSrcDir(property(camelContext, java.io.File.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("analyzer", org.apache.lucene.analysis.Analyzer.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("config", org.apache.camel.component.lucene.LuceneConfiguration.class);
        answer.put("indexDir", java.io.File.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("maxHits", int.class);
        answer.put("srcDir", java.io.File.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        LuceneComponent target = (LuceneComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "analyzer": return getOrCreateConfig(target).getAnalyzer();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "config": return target.getConfig();
        case "indexdir":
        case "indexDir": return getOrCreateConfig(target).getIndexDir();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxhits":
        case "maxHits": return getOrCreateConfig(target).getMaxHits();
        case "srcdir":
        case "srcDir": return getOrCreateConfig(target).getSrcDir();
        default: return null;
        }
    }
}

