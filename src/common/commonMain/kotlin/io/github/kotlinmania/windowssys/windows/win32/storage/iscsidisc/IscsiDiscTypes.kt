package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

public typealias IkeAuthenticationMethod = Int

public typealias IscsiAuthTypes = Int

public typealias IscsiDigestTypes = Int

public typealias MpStorageDiagnosticLevel = Int

public typealias MpStorageDiagnosticTargetType = Int

public typealias NvcacheStatus = Int

public typealias NvcacheType = Int

public typealias NvSepWriteCacheType = Int

public fun interface PdumpDevicePoweronRoutineFn {
    public operator fun invoke(context: ConstPtr): Int
}

public typealias PdumpDevicePoweronRoutine = PdumpDevicePoweronRoutineFn?

public typealias Targetprotocoltype = Int

public typealias TargetInformationClass = Int

public typealias AdapterObject = Long
