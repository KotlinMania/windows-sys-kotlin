package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun DMOEnum(guidcategory: Long, dwflags: UInt, cintypes: UInt, pintypes: Long, couttypes: UInt, pouttypes: Long, ppenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdmo.dll", "DMOEnum", longArrayOf(guidcategory, dwflags.toLong(), cintypes.toLong(), pintypes, couttypes.toLong(), pouttypes, ppenum)).toInt()
}

public fun DMOGetName(clsiddmo: Long, szname: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msdmo.dll", "DMOGetName", longArrayOf(clsiddmo, szname)).toInt()
}

public fun DMOGetTypes(clsiddmo: Long, ulinputtypesrequested: UInt, pulinputtypessupplied: Long, pinputtypes: Long, uloutputtypesrequested: UInt, puloutputtypessupplied: Long, poutputtypes: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdmo.dll", "DMOGetTypes", longArrayOf(clsiddmo, ulinputtypesrequested.toLong(), pulinputtypessupplied, pinputtypes, uloutputtypesrequested.toLong(), puloutputtypessupplied, poutputtypes)).toInt()
}

public fun DMORegister(szname: PCWSTR, clsiddmo: Long, guidcategory: Long, dwflags: UInt, cintypes: UInt, pintypes: Long, couttypes: UInt, pouttypes: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdmo.dll", "DMORegister", longArrayOf(szname, clsiddmo, guidcategory, dwflags.toLong(), cintypes.toLong(), pintypes, couttypes.toLong(), pouttypes)).toInt()
}

public fun DMOUnregister(clsiddmo: Long, guidcategory: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdmo.dll", "DMOUnregister", longArrayOf(clsiddmo, guidcategory)).toInt()
}

public fun MoCopyMediaType(pmtdest: Long, pmtsrc: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdmo.dll", "MoCopyMediaType", longArrayOf(pmtdest, pmtsrc)).toInt()
}

public fun MoCreateMediaType(ppmt: Long, cbformat: UInt): HRESULT {
    return Win32DynamicFfi.invoke("msdmo.dll", "MoCreateMediaType", longArrayOf(ppmt, cbformat.toLong())).toInt()
}

public fun MoDeleteMediaType(pmt: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdmo.dll", "MoDeleteMediaType", longArrayOf(pmt)).toInt()
}

public fun MoDuplicateMediaType(ppmtdest: Long, pmtsrc: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdmo.dll", "MoDuplicateMediaType", longArrayOf(ppmtdest, pmtsrc)).toInt()
}

public fun MoFreeMediaType(pmt: Long): HRESULT {
    return Win32DynamicFfi.invoke("msdmo.dll", "MoFreeMediaType", longArrayOf(pmt)).toInt()
}

public fun MoInitMediaType(pmt: Long, cbformat: UInt): HRESULT {
    return Win32DynamicFfi.invoke("msdmo.dll", "MoInitMediaType", longArrayOf(pmt, cbformat.toLong())).toInt()
}
