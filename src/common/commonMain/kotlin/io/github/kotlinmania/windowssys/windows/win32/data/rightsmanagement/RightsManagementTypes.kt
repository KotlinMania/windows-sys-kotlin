package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.windowssys.core.HRESULT

public typealias DRMATTESTTYPE = Int

public fun interface DRMCALLBACKFn {
    public operator fun invoke(param0: DRM_STATUS_MSG, param1: HRESULT, param2: Long, param3: Long): HRESULT
}

public typealias DRMCALLBACK = DRMCALLBACKFn?

public typealias DRMENCODINGTYPE = Int

public typealias DRMGLOBALOPTIONS = Int

public typealias DRMSECURITYPROVIDERTYPE = Int

public typealias DRMSPECTYPE = Int

public typealias DRMTIMETYPE = Int

public typealias DRM_DISTRIBUTION_POINT_INFO = Int

public typealias DRM_STATUS_MSG = Int

public typealias DRM_USAGEPOLICY_TYPE = Int
