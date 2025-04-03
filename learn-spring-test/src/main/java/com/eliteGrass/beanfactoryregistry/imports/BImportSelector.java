package com.eliteGrass.beanfactoryregistry.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author liteGrass
 * @Date 2025-02-26  22:21
 * @Description
 */
public class BImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{BImport.class.getName()};
	}
}
