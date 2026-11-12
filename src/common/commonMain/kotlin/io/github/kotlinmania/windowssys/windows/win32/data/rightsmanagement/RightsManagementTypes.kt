package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult

public typealias Drmattesttype = Int

public fun interface DrmcallbackFn {
    public operator fun invoke(param0: DrmStatusMsg, param1: Hresult, param2: MutPtr<CVoid>, param3: MutPtr<CVoid>): Hresult
}

public typealias Drmcallback = DrmcallbackFn?

public typealias Drmencodingtype = Int

public typealias Drmglobaloptions = Int

public typealias Drmsecurityprovidertype = Int

public typealias Drmspectype = Int

public typealias Drmtimetype = Int

public typealias DrmDistributionPointInfo = Int

public typealias DrmStatusMsg = Int

public typealias DrmUsagepolicyType = Int
