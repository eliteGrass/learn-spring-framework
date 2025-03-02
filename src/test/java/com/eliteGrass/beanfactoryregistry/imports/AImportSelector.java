package com.eliteGrass.beanfactoryregistry.imports;

import com.eliteGrass.beanfactoryregistry.MyConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author liteGrass
 * @Date 2025-02-26  21:38
 * @Description
 */
public class AImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{AImport.class.getName(), BImportSelector.class.getName()};
	}
}
