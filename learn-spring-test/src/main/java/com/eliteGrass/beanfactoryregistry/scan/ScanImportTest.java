package com.eliteGrass.beanfactoryregistry.scan;

import com.eliteGrass.beanfactoryregistry.entity.C;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author liteGrass
 * @Date 2025-02-26  22:24
 * @Description
 */
@Import(C.class)
@Configuration
public class ScanImportTest {
}
