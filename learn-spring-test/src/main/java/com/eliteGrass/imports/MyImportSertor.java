package com.eliteGrass.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Company Huahui Information Technology Co., LTD.
 * @Author elitegrass
 * @Date 2024-12-12  23:09
 * @Description
 */
public class MyImportSertor implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[0];
	}
}
