package com.kgurgul.cpuinfo.domain.model

data class GpuData(
    val vulkanVersion: String,
    val glesVersio: String,
    val glVendor: String?,
    val glRenderer: String?,
    val glExtensions: String?
)