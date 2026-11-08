package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

public fun interface FnCallback {
    public operator fun invoke(npercentcomplete: UInt)
}

public fun RmAddFilter(dwsessionhandle: UInt, strmodulename: PCWSTR, pprocess: Long, strserviceshortname: PCWSTR, filteraction: RM_FILTER_ACTION): WIN32_ERROR {
    return Win32DynamicFfi.invoke("rstrtmgr.dll", "RmAddFilter", longArrayOf(dwsessionhandle.toLong(), strmodulename, pprocess, strserviceshortname, filteraction.toLong())).toUInt()
}

public fun RmCancelCurrentTask(dwsessionhandle: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("rstrtmgr.dll", "RmCancelCurrentTask", longArrayOf(dwsessionhandle.toLong())).toUInt()
}

public fun RmEndSession(dwsessionhandle: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("rstrtmgr.dll", "RmEndSession", longArrayOf(dwsessionhandle.toLong())).toUInt()
}

public fun RmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: Long, cbfilterbuf: UInt, cbfilterbufneeded: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("rstrtmgr.dll", "RmGetFilterList", longArrayOf(dwsessionhandle.toLong(), pbfilterbuf, cbfilterbuf.toLong(), cbfilterbufneeded)).toUInt()
}

public fun RmGetList(dwsessionhandle: UInt, pnprocinfoneeded: Long, pnprocinfo: Long, rgaffectedapps: Long, lpdwrebootreasons: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("rstrtmgr.dll", "RmGetList", longArrayOf(dwsessionhandle.toLong(), pnprocinfoneeded, pnprocinfo, rgaffectedapps, lpdwrebootreasons)).toUInt()
}

public fun RmJoinSession(psessionhandle: Long, strsessionkey: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("rstrtmgr.dll", "RmJoinSession", longArrayOf(psessionhandle, strsessionkey)).toUInt()
}

public fun RmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: Long, napplications: UInt, rgapplications: Long, nservices: UInt, rgsservicenames: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("rstrtmgr.dll", "RmRegisterResources", longArrayOf(dwsessionhandle.toLong(), nfiles.toLong(), rgsfilenames, napplications.toLong(), rgapplications, nservices.toLong(), rgsservicenames)).toUInt()
}

public fun RmRemoveFilter(dwsessionhandle: UInt, strmodulename: PCWSTR, pprocess: Long, strserviceshortname: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("rstrtmgr.dll", "RmRemoveFilter", longArrayOf(dwsessionhandle.toLong(), strmodulename, pprocess, strserviceshortname)).toUInt()
}

public fun RmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RM_WRITE_STATUS_CALLBACK): WIN32_ERROR {
    return Win32DynamicFfi.invoke("rstrtmgr.dll", "RmRestart", longArrayOf(dwsessionhandle.toLong(), dwrestartflags.toLong(), Win32DynamicFfi.objectSlot(fnstatus))).toUInt()
}

public fun RmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RM_WRITE_STATUS_CALLBACK): WIN32_ERROR {
    return Win32DynamicFfi.invoke("rstrtmgr.dll", "RmShutdown", longArrayOf(dwsessionhandle.toLong(), lactionflags.toLong(), Win32DynamicFfi.objectSlot(fnstatus))).toUInt()
}

public fun RmStartSession(psessionhandle: Long, dwsessionflags: UInt, strsessionkey: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("rstrtmgr.dll", "RmStartSession", longArrayOf(psessionhandle, dwsessionflags.toLong(), strsessionkey)).toUInt()
}
