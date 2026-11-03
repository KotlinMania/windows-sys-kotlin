package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(npercentcomplete: UInt)
}

public fun RmAddFilter(dwsessionhandle: UInt, strmodulename: PCWSTR, pprocess: Long, strserviceshortname: PCWSTR, filteraction: RM_FILTER_ACTION): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("rstrtmgr.dll", "RmAddFilter", longArrayOf(dwsessionhandle.toLong(), strmodulename, pprocess, strserviceshortname, filteraction.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RmCancelCurrentTask(dwsessionhandle: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("rstrtmgr.dll", "RmCancelCurrentTask", longArrayOf(dwsessionhandle.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RmEndSession(dwsessionhandle: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("rstrtmgr.dll", "RmEndSession", longArrayOf(dwsessionhandle.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: Long, cbfilterbuf: UInt, cbfilterbufneeded: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("rstrtmgr.dll", "RmGetFilterList", longArrayOf(dwsessionhandle.toLong(), pbfilterbuf, cbfilterbuf.toLong(), cbfilterbufneeded))
    return Foundation.WIN32_ERROR()
}

public fun RmGetList(dwsessionhandle: UInt, pnprocinfoneeded: Long, pnprocinfo: Long, rgaffectedapps: Long, lpdwrebootreasons: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("rstrtmgr.dll", "RmGetList", longArrayOf(dwsessionhandle.toLong(), pnprocinfoneeded, pnprocinfo, rgaffectedapps, lpdwrebootreasons))
    return Foundation.WIN32_ERROR()
}

public fun RmJoinSession(psessionhandle: Long, strsessionkey: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("rstrtmgr.dll", "RmJoinSession", longArrayOf(psessionhandle, strsessionkey))
    return Foundation.WIN32_ERROR()
}

public fun RmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: Long, napplications: UInt, rgapplications: Long, nservices: UInt, rgsservicenames: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("rstrtmgr.dll", "RmRegisterResources", longArrayOf(dwsessionhandle.toLong(), nfiles.toLong(), rgsfilenames, napplications.toLong(), rgapplications, nservices.toLong(), rgsservicenames))
    return Foundation.WIN32_ERROR()
}

public fun RmRemoveFilter(dwsessionhandle: UInt, strmodulename: PCWSTR, pprocess: Long, strserviceshortname: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("rstrtmgr.dll", "RmRemoveFilter", longArrayOf(dwsessionhandle.toLong(), strmodulename, pprocess, strserviceshortname))
    return Foundation.WIN32_ERROR()
}

public fun RmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RM_WRITE_STATUS_CALLBACK): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("rstrtmgr.dll", "RmRestart", longArrayOf(dwsessionhandle.toLong(), dwrestartflags.toLong(), Win32DynamicFfi.objectSlot(fnstatus)))
    return Foundation.WIN32_ERROR()
}

public fun RmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RM_WRITE_STATUS_CALLBACK): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("rstrtmgr.dll", "RmShutdown", longArrayOf(dwsessionhandle.toLong(), lactionflags.toLong(), Win32DynamicFfi.objectSlot(fnstatus)))
    return Foundation.WIN32_ERROR()
}

public fun RmStartSession(psessionhandle: Long, dwsessionflags: UInt, strsessionkey: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("rstrtmgr.dll", "RmStartSession", longArrayOf(psessionhandle, dwsessionflags.toLong(), strsessionkey))
    return Foundation.WIN32_ERROR()
}
