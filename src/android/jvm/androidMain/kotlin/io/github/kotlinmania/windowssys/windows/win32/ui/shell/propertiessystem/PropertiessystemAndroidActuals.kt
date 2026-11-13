@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum

private object WindowsWin32UiShellPropertiessystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSCoerceToCanonicalValue(key: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSCreateAdapterFromPropertyStore(pps: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSCreateDelayedMultiplexPropertyStore(flags: Int, pdpsf: Long, rgstoreids: Long, cstores: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSCreateMemoryPropertyStore(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSCreateMultiplexPropertyStore(prgpunkstores: Long, cstores: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyChangeArray(rgpropkey: Long, rgflags: Long, rgpropvar: Long, cchanges: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromObject(punk: Long, grfmode: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromPropertySetStorage(ppss: Long, grfmode: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSCreateSimplePropertyChange(flags: Int, key: Long, propvar: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSEnumeratePropertyDescriptions(filteron: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplay(propkey: Long, propvar: Long, pdfflags: Int, pwsztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplayAlloc(key: Long, propvar: Long, pdff: Int, ppszdisplay: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSFormatPropertyValue(pps: Long, ppd: Long, pdff: Int, ppszdisplay: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSGetImageReferenceForValue(propkey: Long, propvar: Long, ppszimageres: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandler(punkitem: Long, freadwrite: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandlerWithCreateObject(punkitem: Long, freadwrite: Int, punkcreateobject: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSGetNameFromPropertyKey(propkey: Long, ppszcanonicalname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSGetNamedPropertyFromPropertyStorage(psps: Long, cb: Int, pszname: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescription(propkey: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionByName(pszcanonicalname: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionListFromString(pszproplist: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyFromPropertyStorage(psps: Long, cb: Int, rpkey: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyKeyFromName(pszname: Long, ppropkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSGetPropertySystem(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyValue(pps: Long, ppd: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSLookupPropertyHandlerCLSID(pszfilepath: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagDelete(propbag: Long, propname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBool(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBstr(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadDword(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadGuid(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadInt(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadLong(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPointl(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPoints(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPropertyKey(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadRectl(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadShort(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStr(propbag: Long, propname: Long, value: Long, charactercount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStrAlloc(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStream(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadType(propbag: Long, propname: Long, variable: Long, type: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUlonglong(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUnknown(propbag: Long, propname: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBool(propbag: Long, propname: Long, value: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBstr(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteDword(propbag: Long, propname: Long, value: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteGuid(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteInt(propbag: Long, propname: Long, value: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteLong(propbag: Long, propname: Long, value: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePointl(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePoints(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePropertyKey(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteRectl(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteShort(propbag: Long, propname: Long, value: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStr(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStream(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUlonglong(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUnknown(propbag: Long, propname: Long, punk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSPropertyKeyFromString(pszstring: Long, pkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSRegisterPropertySchema(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSSetPropertyValue(pps: Long, ppd: Long, propvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSStringFromPropertyKey(pkey: Long, psz: Long, cch: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPSUnregisterPropertySchema(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPifMgrCloseProperties(hprops: Long, flopt: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPifMgrGetProperties(hprops: Long, pszgroup: Long, lpprops: Long, cbprops: Int, flopt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPifMgrOpenProperties(pszapp: Long, pszpif: Long, hinf: Int, flopt: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemPifMgrSetProperties(hprops: Long, pszgroup: Long, lpprops: Long, cbprops: Int, flopt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemSHAddDefaultPropertiesByExt(pszext: Long, ppropstore: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreForWindow(hwnd: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromIDList(pidl: Long, flags: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromParsingName(pszpath: Long, pbc: Long, flags: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemSHPropStgCreate(psstg: Long, fmtid: Long, pclsid: Long, grfflags: Int, grfmode: Int, dwdisposition: Int, ppstg: Long, pucodepage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemSHPropStgReadMultiple(pps: Long, ucodepage: Int, cpspec: Int, rgpspec: Long, rgvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropertiessystemSHPropStgWriteMultiple(pps: Long, pucodepage: Long, cpspec: Int, rgpspec: Long, rgvar: Long, propidnamefirst: Int): Int
}

public actual fun pSCoerceToCanonicalValue(key: ConstPtr, ppropvar: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSCoerceToCanonicalValue(key.rawAddress, ppropvar.rawAddress)

public actual fun pSCreateAdapterFromPropertyStore(pps: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSCreateAdapterFromPropertyStore(pps.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun pSCreateDelayedMultiplexPropertyStore(flags: Getpropertystoreflags, pdpsf: MutPtr, rgstoreids: ConstPtr, cstores: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSCreateDelayedMultiplexPropertyStore(flags, pdpsf.rawAddress, rgstoreids.rawAddress, cstores.toInt(), riid.rawAddress, ppv.rawAddress)

public actual fun pSCreateMemoryPropertyStore(riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSCreateMemoryPropertyStore(riid.rawAddress, ppv.rawAddress)

public actual fun pSCreateMultiplexPropertyStore(prgpunkstores: ConstPtr, cstores: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSCreateMultiplexPropertyStore(prgpunkstores.rawAddress, cstores.toInt(), riid.rawAddress, ppv.rawAddress)

public actual fun pSCreatePropertyChangeArray(rgpropkey: ConstPtr, rgflags: ConstPtr, rgpropvar: ConstPtr, cchanges: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyChangeArray(rgpropkey.rawAddress, rgflags.rawAddress, rgpropvar.rawAddress, cchanges.toInt(), riid.rawAddress, ppv.rawAddress)

public actual fun pSCreatePropertyStoreFromObject(punk: MutPtr, grfmode: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromObject(punk.rawAddress, grfmode.toInt(), riid.rawAddress, ppv.rawAddress)

public actual fun pSCreatePropertyStoreFromPropertySetStorage(ppss: MutPtr, grfmode: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromPropertySetStorage(ppss.rawAddress, grfmode.toInt(), riid.rawAddress, ppv.rawAddress)

public actual fun pSCreateSimplePropertyChange(flags: PkaFlags, key: ConstPtr, propvar: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSCreateSimplePropertyChange(flags, key.rawAddress, propvar.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun pSEnumeratePropertyDescriptions(filteron: PropdescEnumfilter, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSEnumeratePropertyDescriptions(filteron, riid.rawAddress, ppv.rawAddress)

public actual fun pSFormatForDisplay(propkey: ConstPtr, propvar: ConstPtr, pdfflags: PropdescFormatFlags, pwsztext: Pwstr, cchtext: UInt): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplay(propkey.rawAddress, propvar.rawAddress, pdfflags, pwsztext.rawAddress, cchtext.toInt())

public actual fun pSFormatForDisplayAlloc(key: ConstPtr, propvar: ConstPtr, pdff: PropdescFormatFlags, ppszdisplay: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplayAlloc(key.rawAddress, propvar.rawAddress, pdff, ppszdisplay.rawAddress)

public actual fun pSFormatPropertyValue(pps: MutPtr, ppd: MutPtr, pdff: PropdescFormatFlags, ppszdisplay: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSFormatPropertyValue(pps.rawAddress, ppd.rawAddress, pdff, ppszdisplay.rawAddress)

public actual fun pSGetImageReferenceForValue(propkey: ConstPtr, propvar: ConstPtr, ppszimageres: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSGetImageReferenceForValue(propkey.rawAddress, propvar.rawAddress, ppszimageres.rawAddress)

public actual fun pSGetItemPropertyHandler(punkitem: MutPtr, freadwrite: Bool, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandler(punkitem.rawAddress, freadwrite, riid.rawAddress, ppv.rawAddress)

public actual fun pSGetItemPropertyHandlerWithCreateObject(punkitem: MutPtr, freadwrite: Bool, punkcreateobject: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandlerWithCreateObject(punkitem.rawAddress, freadwrite, punkcreateobject.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun pSGetNameFromPropertyKey(propkey: ConstPtr, ppszcanonicalname: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSGetNameFromPropertyKey(propkey.rawAddress, ppszcanonicalname.rawAddress)

public actual fun pSGetNamedPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, pszname: Pcwstr, ppropvar: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSGetNamedPropertyFromPropertyStorage(psps, cb.toInt(), pszname.rawAddress, ppropvar.rawAddress)

public actual fun pSGetPropertyDescription(propkey: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescription(propkey.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun pSGetPropertyDescriptionByName(pszcanonicalname: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionByName(pszcanonicalname.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun pSGetPropertyDescriptionListFromString(pszproplist: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionListFromString(pszproplist.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun pSGetPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, rpkey: ConstPtr, ppropvar: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyFromPropertyStorage(psps, cb.toInt(), rpkey.rawAddress, ppropvar.rawAddress)

public actual fun pSGetPropertyKeyFromName(pszname: Pcwstr, ppropkey: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyKeyFromName(pszname.rawAddress, ppropkey.rawAddress)

public actual fun pSGetPropertySystem(riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertySystem(riid.rawAddress, ppv.rawAddress)

public actual fun pSGetPropertyValue(pps: MutPtr, ppd: MutPtr, ppropvar: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyValue(pps.rawAddress, ppd.rawAddress, ppropvar.rawAddress)

public actual fun pSLookupPropertyHandlerCLSID(pszfilepath: Pcwstr, pclsid: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSLookupPropertyHandlerCLSID(pszfilepath.rawAddress, pclsid.rawAddress)

public actual fun pspropertyBagDelete(propbag: MutPtr, propname: Pcwstr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagDelete(propbag.rawAddress, propname.rawAddress)

public actual fun pspropertyBagReadBool(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBool(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagReadBstr(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBstr(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagReadDword(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadDword(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagReadGuid(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadGuid(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagReadInt(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadInt(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagReadLong(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadLong(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagReadPointl(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPointl(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagReadPoints(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPoints(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagReadPropertyKey(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPropertyKey(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagReadRectl(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadRectl(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagReadShort(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadShort(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagReadStr(propbag: MutPtr, propname: Pcwstr, value: Pwstr, charactercount: Int): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStr(propbag.rawAddress, propname.rawAddress, value.rawAddress, charactercount)

public actual fun pspropertyBagReadStrAlloc(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStrAlloc(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagReadStream(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStream(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagReadType(propbag: MutPtr, propname: Pcwstr, variable: MutPtr, type: Varenum): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadType(propbag.rawAddress, propname.rawAddress, variable.rawAddress, type.toShort())

public actual fun pspropertyBagReadUlonglong(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUlonglong(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagReadUnknown(propbag: MutPtr, propname: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUnknown(propbag.rawAddress, propname.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun pspropertyBagWriteBool(propbag: MutPtr, propname: Pcwstr, value: Bool): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBool(propbag.rawAddress, propname.rawAddress, value)

public actual fun pspropertyBagWriteBstr(propbag: MutPtr, propname: Pcwstr, value: Bstr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBstr(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagWriteDword(propbag: MutPtr, propname: Pcwstr, value: UInt): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteDword(propbag.rawAddress, propname.rawAddress, value.toInt())

public actual fun pspropertyBagWriteGuid(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteGuid(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagWriteInt(propbag: MutPtr, propname: Pcwstr, value: Int): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteInt(propbag.rawAddress, propname.rawAddress, value)

public actual fun pspropertyBagWriteLong(propbag: MutPtr, propname: Pcwstr, value: Int): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteLong(propbag.rawAddress, propname.rawAddress, value)

public actual fun pspropertyBagWritePointl(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePointl(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagWritePoints(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePoints(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagWritePropertyKey(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePropertyKey(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagWriteRectl(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteRectl(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagWriteShort(propbag: MutPtr, propname: Pcwstr, value: Short): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteShort(propbag.rawAddress, propname.rawAddress, value)

public actual fun pspropertyBagWriteStr(propbag: MutPtr, propname: Pcwstr, value: Pcwstr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStr(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagWriteStream(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStream(propbag.rawAddress, propname.rawAddress, value.rawAddress)

public actual fun pspropertyBagWriteUlonglong(propbag: MutPtr, propname: Pcwstr, value: ULong): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUlonglong(propbag.rawAddress, propname.rawAddress, value.toLong())

public actual fun pspropertyBagWriteUnknown(propbag: MutPtr, propname: Pcwstr, punk: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUnknown(propbag.rawAddress, propname.rawAddress, punk.rawAddress)

public actual fun pSPropertyKeyFromString(pszstring: Pcwstr, pkey: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSPropertyKeyFromString(pszstring.rawAddress, pkey.rawAddress)

public actual fun pSRefreshPropertySchema(): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema()

public actual fun pSRegisterPropertySchema(pszpath: Pcwstr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSRegisterPropertySchema(pszpath.rawAddress)

public actual fun pSSetPropertyValue(pps: MutPtr, ppd: MutPtr, propvar: ConstPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSSetPropertyValue(pps.rawAddress, ppd.rawAddress, propvar.rawAddress)

public actual fun pSStringFromPropertyKey(pkey: ConstPtr, psz: Pwstr, cch: UInt): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSStringFromPropertyKey(pkey.rawAddress, psz.rawAddress, cch.toInt())

public actual fun pSUnregisterPropertySchema(pszpath: Pcwstr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPSUnregisterPropertySchema(pszpath.rawAddress)

public actual fun pifMgrCloseProperties(hprops: Handle, flopt: UInt): Handle =
    MutPtr(WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPifMgrCloseProperties(hprops.rawAddress, flopt.toInt()))

public actual fun pifMgrGetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: MutPtr, cbprops: Int, flopt: UInt): Int =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPifMgrGetProperties(hprops.rawAddress, pszgroup.rawAddress, lpprops.rawAddress, cbprops, flopt.toInt())

public actual fun pifMgrOpenProperties(pszapp: Pcwstr, pszpif: Pcwstr, hinf: UInt, flopt: UInt): Handle =
    MutPtr(WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPifMgrOpenProperties(pszapp.rawAddress, pszpif.rawAddress, hinf.toInt(), flopt.toInt()))

public actual fun pifMgrSetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: ConstPtr, cbprops: Int, flopt: UInt): Int =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemPifMgrSetProperties(hprops.rawAddress, pszgroup.rawAddress, lpprops.rawAddress, cbprops, flopt.toInt())

public actual fun sHAddDefaultPropertiesByExt(pszext: Pcwstr, ppropstore: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemSHAddDefaultPropertiesByExt(pszext.rawAddress, ppropstore.rawAddress)

public actual fun sHGetPropertyStoreForWindow(hwnd: Hwnd, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreForWindow(hwnd.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun sHGetPropertyStoreFromIDList(pidl: ConstPtr, flags: Getpropertystoreflags, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromIDList(pidl.rawAddress, flags, riid.rawAddress, ppv.rawAddress)

public actual fun sHGetPropertyStoreFromParsingName(pszpath: Pcwstr, pbc: MutPtr, flags: Getpropertystoreflags, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromParsingName(pszpath.rawAddress, pbc.rawAddress, flags, riid.rawAddress, ppv.rawAddress)

public actual fun sHPropStgCreate(psstg: MutPtr, fmtid: ConstPtr, pclsid: ConstPtr, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: MutPtr, pucodepage: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemSHPropStgCreate(psstg.rawAddress, fmtid.rawAddress, pclsid.rawAddress, grfflags.toInt(), grfmode.toInt(), dwdisposition.toInt(), ppstg.rawAddress, pucodepage.rawAddress)

public actual fun sHPropStgReadMultiple(pps: MutPtr, ucodepage: UInt, cpspec: UInt, rgpspec: ConstPtr, rgvar: MutPtr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemSHPropStgReadMultiple(pps.rawAddress, ucodepage.toInt(), cpspec.toInt(), rgpspec.rawAddress, rgvar.rawAddress)

public actual fun sHPropStgWriteMultiple(pps: MutPtr, pucodepage: MutPtr, cpspec: UInt, rgpspec: ConstPtr, rgvar: MutPtr, propidnamefirst: UInt): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssysWindowsWin32UiShellPropertiessystemSHPropStgWriteMultiple(pps.rawAddress, pucodepage.rawAddress, cpspec.toInt(), rgpspec.rawAddress, rgvar.rawAddress, propidnamefirst.toInt())
