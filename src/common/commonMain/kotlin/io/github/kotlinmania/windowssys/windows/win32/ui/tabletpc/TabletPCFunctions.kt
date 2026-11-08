package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun AddStroke(hrc: HRECOCONTEXT, ppacketdesc: Long, cbpacket: UInt, ppacket: Long, pxform: Long): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "AddStroke", longArrayOf(hrc, ppacketdesc, cbpacket.toLong(), ppacket, pxform)).toInt()
}

public fun AddWordsToWordList(hwl: HRECOWORDLIST, pwcwords: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "AddWordsToWordList", longArrayOf(hwl, pwcwords)).toInt()
}

public fun AdviseInkChange(hrc: HRECOCONTEXT, bnewstroke: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "AdviseInkChange", longArrayOf(hrc, bnewstroke.toLong())).toInt()
}

public fun CreateContext(hrec: HRECOGNIZER, phrc: Long): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "CreateContext", longArrayOf(hrec, phrc)).toInt()
}

public fun CreateRecognizer(pclsid: Long, phrec: Long): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "CreateRecognizer", longArrayOf(pclsid, phrec)).toInt()
}

public fun DestroyContext(hrc: HRECOCONTEXT): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "DestroyContext", longArrayOf(hrc)).toInt()
}

public fun DestroyRecognizer(hrec: HRECOGNIZER): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "DestroyRecognizer", longArrayOf(hrec)).toInt()
}

public fun DestroyWordList(hwl: HRECOWORDLIST): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "DestroyWordList", longArrayOf(hwl)).toInt()
}

public fun EndInkInput(hrc: HRECOCONTEXT): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "EndInkInput", longArrayOf(hrc)).toInt()
}

public fun GetAllRecognizers(recognizerclsids: Long, count: Long): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "GetAllRecognizers", longArrayOf(recognizerclsids, count)).toInt()
}

public fun GetBestResultString(hrc: HRECOCONTEXT, pcsize: Long, pwcbestresult: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "GetBestResultString", longArrayOf(hrc, pcsize, pwcbestresult)).toInt()
}

public fun GetLatticePtr(hrc: HRECOCONTEXT, pplattice: Long): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "GetLatticePtr", longArrayOf(hrc, pplattice)).toInt()
}

public fun GetLeftSeparator(hrc: HRECOCONTEXT, pcsize: Long, pwcleftseparator: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "GetLeftSeparator", longArrayOf(hrc, pcsize, pwcleftseparator)).toInt()
}

public fun GetRecoAttributes(hrec: HRECOGNIZER, precoattrs: Long): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "GetRecoAttributes", longArrayOf(hrec, precoattrs)).toInt()
}

public fun GetResultPropertyList(hrec: HRECOGNIZER, ppropertycount: Long, ppropertyguid: Long): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "GetResultPropertyList", longArrayOf(hrec, ppropertycount, ppropertyguid)).toInt()
}

public fun GetRightSeparator(hrc: HRECOCONTEXT, pcsize: Long, pwcrightseparator: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "GetRightSeparator", longArrayOf(hrc, pcsize, pwcrightseparator)).toInt()
}

public fun GetUnicodeRanges(hrec: HRECOGNIZER, pcranges: Long, pcr: Long): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "GetUnicodeRanges", longArrayOf(hrec, pcranges, pcr)).toInt()
}

public fun IsStringSupported(hrc: HRECOCONTEXT, wcstring: UInt, pwcstring: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "IsStringSupported", longArrayOf(hrc, wcstring.toLong(), pwcstring)).toInt()
}

public fun LoadCachedAttributes(clsid: GUID, precoattributes: Long): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "LoadCachedAttributes", longArrayOf(run { val buf = ByteArray(16); buf[0] = (clsid.data1.toInt() and 0xFF).toByte(); buf[1] = ((clsid.data1.toInt() ushr 8) and 0xFF).toByte(); buf[2] = ((clsid.data1.toInt() ushr 16) and 0xFF).toByte(); buf[3] = ((clsid.data1.toInt() ushr 24) and 0xFF).toByte(); buf[4] = (clsid.data2.toInt() and 0xFF).toByte(); buf[5] = ((clsid.data2.toInt() ushr 8) and 0xFF).toByte(); buf[6] = (clsid.data3.toInt() and 0xFF).toByte(); buf[7] = ((clsid.data3.toInt() ushr 8) and 0xFF).toByte(); for (i in 0 until minOf(8, clsid.data4.size)) buf[8 + i] = clsid.data4[i].toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, precoattributes)).toInt()
}

public fun MakeWordList(hrec: HRECOGNIZER, pbuffer: PCWSTR, phwl: Long): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "MakeWordList", longArrayOf(hrec, pbuffer, phwl)).toInt()
}

public fun Process(hrc: HRECOCONTEXT, pbpartialprocessing: Long): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "Process", longArrayOf(hrc, pbpartialprocessing)).toInt()
}

public fun SetEnabledUnicodeRanges(hrc: HRECOCONTEXT, cranges: UInt, pcr: Long): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "SetEnabledUnicodeRanges", longArrayOf(hrc, cranges.toLong(), pcr)).toInt()
}

public fun SetFactoid(hrc: HRECOCONTEXT, cwcfactoid: UInt, pwcfactoid: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "SetFactoid", longArrayOf(hrc, cwcfactoid.toLong(), pwcfactoid)).toInt()
}

public fun SetFlags(hrc: HRECOCONTEXT, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "SetFlags", longArrayOf(hrc, dwflags.toLong())).toInt()
}

public fun SetGuide(hrc: HRECOCONTEXT, pguide: Long, iindex: UInt): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "SetGuide", longArrayOf(hrc, pguide, iindex.toLong())).toInt()
}

public fun SetTextContext(hrc: HRECOCONTEXT, cwcbefore: UInt, pwcbefore: PCWSTR, cwcafter: UInt, pwcafter: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "SetTextContext", longArrayOf(hrc, cwcbefore.toLong(), pwcbefore, cwcafter.toLong(), pwcafter)).toInt()
}

public fun SetWordList(hrc: HRECOCONTEXT, hwl: HRECOWORDLIST): HRESULT {
    return Win32DynamicFfi.invoke("inkobjcore.dll", "SetWordList", longArrayOf(hrc, hwl)).toInt()
}
