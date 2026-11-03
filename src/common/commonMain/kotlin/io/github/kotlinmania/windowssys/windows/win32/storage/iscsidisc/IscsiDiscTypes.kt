package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

public typealias IKE_AUTHENTICATION_METHOD = Int

public typealias ISCSI_AUTH_TYPES = Int

public typealias ISCSI_DIGEST_TYPES = Int

public typealias MP_STORAGE_DIAGNOSTIC_LEVEL = Int

public typealias MP_STORAGE_DIAGNOSTIC_TARGET_TYPE = Int

public typealias NVCACHE_STATUS = Int

public typealias NVCACHE_TYPE = Int

public typealias NV_SEP_WRITE_CACHE_TYPE = Int

public fun interface PDUMP_DEVICE_POWERON_ROUTINEFn {
    public operator fun invoke(context: Long): Int
}

public typealias PDUMP_DEVICE_POWERON_ROUTINE = PDUMP_DEVICE_POWERON_ROUTINEFn?

public typealias TARGETPROTOCOLTYPE = Int

public typealias TARGET_INFORMATION_CLASS = Int

public typealias _ADAPTER_OBJECT = Long
