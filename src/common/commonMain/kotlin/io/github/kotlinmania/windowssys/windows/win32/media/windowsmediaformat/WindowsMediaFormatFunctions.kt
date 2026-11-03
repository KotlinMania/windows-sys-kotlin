package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun WMCreateBackupRestorer(pcallback: Long, ppbackup: Long): HRESULT {
    return Win32DynamicFfi.invoke("wmvcore.dll", "WMCreateBackupRestorer", longArrayOf(pcallback, ppbackup)).toInt()
}

public fun WMCreateEditor(ppeditor: Long): HRESULT {
    return Win32DynamicFfi.invoke("wmvcore.dll", "WMCreateEditor", longArrayOf(ppeditor)).toInt()
}

public fun WMCreateIndexer(ppindexer: Long): HRESULT {
    return Win32DynamicFfi.invoke("wmvcore.dll", "WMCreateIndexer", longArrayOf(ppindexer)).toInt()
}

public fun WMCreateProfileManager(ppprofilemanager: Long): HRESULT {
    return Win32DynamicFfi.invoke("wmvcore.dll", "WMCreateProfileManager", longArrayOf(ppprofilemanager)).toInt()
}

public fun WMCreateReader(punkcert: Long, dwrights: UInt, ppreader: Long): HRESULT {
    return Win32DynamicFfi.invoke("wmvcore.dll", "WMCreateReader", longArrayOf(punkcert, dwrights.toLong(), ppreader)).toInt()
}

public fun WMCreateSyncReader(punkcert: Long, dwrights: UInt, ppsyncreader: Long): HRESULT {
    return Win32DynamicFfi.invoke("wmvcore.dll", "WMCreateSyncReader", longArrayOf(punkcert, dwrights.toLong(), ppsyncreader)).toInt()
}

public fun WMCreateWriter(punkcert: Long, ppwriter: Long): HRESULT {
    return Win32DynamicFfi.invoke("wmvcore.dll", "WMCreateWriter", longArrayOf(punkcert, ppwriter)).toInt()
}

public fun WMCreateWriterFileSink(ppsink: Long): HRESULT {
    return Win32DynamicFfi.invoke("wmvcore.dll", "WMCreateWriterFileSink", longArrayOf(ppsink)).toInt()
}

public fun WMCreateWriterNetworkSink(ppsink: Long): HRESULT {
    return Win32DynamicFfi.invoke("wmvcore.dll", "WMCreateWriterNetworkSink", longArrayOf(ppsink)).toInt()
}

public fun WMCreateWriterPushSink(ppsink: Long): HRESULT {
    return Win32DynamicFfi.invoke("wmvcore.dll", "WMCreateWriterPushSink", longArrayOf(ppsink)).toInt()
}

public fun WMIsContentProtected(pwszfilename: PCWSTR, pfisprotected: Long): HRESULT {
    return Win32DynamicFfi.invoke("wmvcore.dll", "WMIsContentProtected", longArrayOf(pwszfilename, pfisprotected)).toInt()
}
