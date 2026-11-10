@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem

import io.github.kotlinmania.windowssys.COpaquePointer
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
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSCoerceToCanonicalValue(key: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSCreateAdapterFromPropertyStore(pps: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSCreateDelayedMultiplexPropertyStore(flags: Int, pdpsf: Long, rgstoreids: Long, cstores: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSCreateMemoryPropertyStore(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSCreateMultiplexPropertyStore(prgpunkstores: Long, cstores: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyChangeArray(rgpropkey: Long, rgflags: Long, rgpropvar: Long, cchanges: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyStoreFromObject(punk: Long, grfmode: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyStoreFromPropertySetStorage(ppss: Long, grfmode: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSCreateSimplePropertyChange(flags: Int, key: Long, propvar: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSEnumeratePropertyDescriptions(filteron: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSFormatForDisplay(propkey: Long, propvar: Long, pdfflags: Int, pwsztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSFormatForDisplayAlloc(key: Long, propvar: Long, pdff: Int, ppszdisplay: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSFormatPropertyValue(pps: Long, ppd: Long, pdff: Int, ppszdisplay: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSGetImageReferenceForValue(propkey: Long, propvar: Long, ppszimageres: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSGetItemPropertyHandler(punkitem: Long, freadwrite: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSGetItemPropertyHandlerWithCreateObject(punkitem: Long, freadwrite: Int, punkcreateobject: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSGetNameFromPropertyKey(propkey: Long, ppszcanonicalname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSGetNamedPropertyFromPropertyStorage(psps: Long, cb: Int, pszname: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescription(propkey: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescriptionByName(pszcanonicalname: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescriptionListFromString(pszproplist: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyFromPropertyStorage(psps: Long, cb: Int, rpkey: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyKeyFromName(pszname: Long, ppropkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertySystem(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyValue(pps: Long, ppd: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSLookupPropertyHandlerCLSID(pszfilepath: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagDelete(propbag: Long, propname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadBool(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadBstr(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadDword(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadGuid(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadInt(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadLong(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPointl(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPoints(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPropertyKey(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadRectl(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadShort(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStr(propbag: Long, propname: Long, value: Long, charactercount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStrAlloc(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStream(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadType(propbag: Long, propname: Long, variable: Long, type: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadUlonglong(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadUnknown(propbag: Long, propname: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteBool(propbag: Long, propname: Long, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteBstr(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteDword(propbag: Long, propname: Long, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteGuid(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteInt(propbag: Long, propname: Long, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteLong(propbag: Long, propname: Long, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePointl(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePoints(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePropertyKey(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteRectl(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteShort(propbag: Long, propname: Long, value: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteStr(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteStream(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteUlonglong(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteUnknown(propbag: Long, propname: Long, punk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSPropertyKeyFromString(pszstring: Long, pkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSRefreshPropertySchema(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSRegisterPropertySchema(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSSetPropertyValue(pps: Long, ppd: Long, propvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSStringFromPropertyKey(pkey: Long, psz: Long, cch: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pSUnregisterPropertySchema(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pifMgrCloseProperties(hprops: Long, flopt: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pifMgrGetProperties(hprops: Long, pszgroup: Long, lpprops: Long, cbprops: Int, flopt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pifMgrOpenProperties(pszapp: Long, pszpif: Long, hinf: Int, flopt: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_pifMgrSetProperties(hprops: Long, pszgroup: Long, lpprops: Long, cbprops: Int, flopt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_sHAddDefaultPropertiesByExt(pszext: Long, ppropstore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreForWindow(hwnd: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreFromIDList(pidl: Long, flags: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreFromParsingName(pszpath: Long, pbc: Long, flags: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgCreate(psstg: Long, fmtid: Long, pclsid: Long, grfflags: Int, grfmode: Int, dwdisposition: Int, ppstg: Long, pucodepage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgReadMultiple(pps: Long, ucodepage: Int, cpspec: Int, rgpspec: Long, rgvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgWriteMultiple(pps: Long, pucodepage: Long, cpspec: Int, rgpspec: Long, rgvar: Long, propidnamefirst: Int): Int
}

public actual fun pSCoerceToCanonicalValue(key: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSCoerceToCanonicalValue((key?.value ?: 0L), (ppropvar?.value ?: 0L))

public actual fun pSCreateAdapterFromPropertyStore(pps: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateAdapterFromPropertyStore((pps?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSCreateDelayedMultiplexPropertyStore(flags: Getpropertystoreflags, pdpsf: COpaquePointer?, rgstoreids: COpaquePointer?, cstores: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateDelayedMultiplexPropertyStore(flags, (pdpsf?.value ?: 0L), (rgstoreids?.value ?: 0L), cstores.toInt(), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSCreateMemoryPropertyStore(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateMemoryPropertyStore((riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSCreateMultiplexPropertyStore(prgpunkstores: COpaquePointer?, cstores: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateMultiplexPropertyStore((prgpunkstores?.value ?: 0L), cstores.toInt(), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSCreatePropertyChangeArray(rgpropkey: COpaquePointer?, rgflags: COpaquePointer?, rgpropvar: COpaquePointer?, cchanges: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyChangeArray((rgpropkey?.value ?: 0L), (rgflags?.value ?: 0L), (rgpropvar?.value ?: 0L), cchanges.toInt(), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSCreatePropertyStoreFromObject(punk: COpaquePointer?, grfmode: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyStoreFromObject((punk?.value ?: 0L), grfmode.toInt(), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSCreatePropertyStoreFromPropertySetStorage(ppss: COpaquePointer?, grfmode: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyStoreFromPropertySetStorage((ppss?.value ?: 0L), grfmode.toInt(), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSCreateSimplePropertyChange(flags: PkaFlags, key: COpaquePointer?, propvar: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateSimplePropertyChange(flags, (key?.value ?: 0L), (propvar?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSEnumeratePropertyDescriptions(filteron: PropdescEnumfilter, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSEnumeratePropertyDescriptions(filteron, (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSFormatForDisplay(propkey: COpaquePointer?, propvar: COpaquePointer?, pdfflags: PropdescFormatFlags, pwsztext: Pwstr, cchtext: UInt): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSFormatForDisplay((propkey?.value ?: 0L), (propvar?.value ?: 0L), pdfflags, (pwsztext?.value ?: 0L), cchtext.toInt())

public actual fun pSFormatForDisplayAlloc(key: COpaquePointer?, propvar: COpaquePointer?, pdff: PropdescFormatFlags, ppszdisplay: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSFormatForDisplayAlloc((key?.value ?: 0L), (propvar?.value ?: 0L), pdff, (ppszdisplay?.value ?: 0L))

public actual fun pSFormatPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, pdff: PropdescFormatFlags, ppszdisplay: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSFormatPropertyValue((pps?.value ?: 0L), (ppd?.value ?: 0L), pdff, (ppszdisplay?.value ?: 0L))

public actual fun pSGetImageReferenceForValue(propkey: COpaquePointer?, propvar: COpaquePointer?, ppszimageres: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSGetImageReferenceForValue((propkey?.value ?: 0L), (propvar?.value ?: 0L), (ppszimageres?.value ?: 0L))

public actual fun pSGetItemPropertyHandler(punkitem: COpaquePointer?, freadwrite: Bool, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSGetItemPropertyHandler((punkitem?.value ?: 0L), freadwrite, (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSGetItemPropertyHandlerWithCreateObject(punkitem: COpaquePointer?, freadwrite: Bool, punkcreateobject: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSGetItemPropertyHandlerWithCreateObject((punkitem?.value ?: 0L), freadwrite, (punkcreateobject?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSGetNameFromPropertyKey(propkey: COpaquePointer?, ppszcanonicalname: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSGetNameFromPropertyKey((propkey?.value ?: 0L), (ppszcanonicalname?.value ?: 0L))

public actual fun pSGetNamedPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, pszname: Pcwstr, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSGetNamedPropertyFromPropertyStorage(psps.toLong(), cb.toInt(), (pszname?.value ?: 0L), (ppropvar?.value ?: 0L))

public actual fun pSGetPropertyDescription(propkey: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescription((propkey?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSGetPropertyDescriptionByName(pszcanonicalname: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescriptionByName((pszcanonicalname?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSGetPropertyDescriptionListFromString(pszproplist: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescriptionListFromString((pszproplist?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSGetPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, rpkey: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyFromPropertyStorage(psps.toLong(), cb.toInt(), (rpkey?.value ?: 0L), (ppropvar?.value ?: 0L))

public actual fun pSGetPropertyKeyFromName(pszname: Pcwstr, ppropkey: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyKeyFromName((pszname?.value ?: 0L), (ppropkey?.value ?: 0L))

public actual fun pSGetPropertySystem(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertySystem((riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pSGetPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyValue((pps?.value ?: 0L), (ppd?.value ?: 0L), (ppropvar?.value ?: 0L))

public actual fun pSLookupPropertyHandlerCLSID(pszfilepath: Pcwstr, pclsid: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSLookupPropertyHandlerCLSID((pszfilepath?.value ?: 0L), (pclsid?.value ?: 0L))

public actual fun pspropertyBagDelete(propbag: COpaquePointer?, propname: Pcwstr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagDelete((propbag?.value ?: 0L), (propname?.value ?: 0L))

public actual fun pspropertyBagReadBool(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadBool((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagReadBstr(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadBstr((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagReadDword(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadDword((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagReadGuid(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadGuid((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagReadInt(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadInt((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagReadLong(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadLong((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagReadPointl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPointl((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagReadPoints(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPoints((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagReadPropertyKey(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPropertyKey((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagReadRectl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadRectl((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagReadShort(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadShort((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagReadStr(propbag: COpaquePointer?, propname: Pcwstr, value: Pwstr, charactercount: Int): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStr((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L), charactercount)

public actual fun pspropertyBagReadStrAlloc(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStrAlloc((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagReadStream(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStream((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagReadType(propbag: COpaquePointer?, propname: Pcwstr, variable: COpaquePointer?, type: Varenum): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadType((propbag?.value ?: 0L), (propname?.value ?: 0L), (variable?.value ?: 0L), type.toShort())

public actual fun pspropertyBagReadUlonglong(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadUlonglong((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagReadUnknown(propbag: COpaquePointer?, propname: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadUnknown((propbag?.value ?: 0L), (propname?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun pspropertyBagWriteBool(propbag: COpaquePointer?, propname: Pcwstr, value: Bool): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteBool((propbag?.value ?: 0L), (propname?.value ?: 0L), value)

public actual fun pspropertyBagWriteBstr(propbag: COpaquePointer?, propname: Pcwstr, value: Bstr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteBstr((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagWriteDword(propbag: COpaquePointer?, propname: Pcwstr, value: UInt): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteDword((propbag?.value ?: 0L), (propname?.value ?: 0L), value.toInt())

public actual fun pspropertyBagWriteGuid(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteGuid((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagWriteInt(propbag: COpaquePointer?, propname: Pcwstr, value: Int): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteInt((propbag?.value ?: 0L), (propname?.value ?: 0L), value)

public actual fun pspropertyBagWriteLong(propbag: COpaquePointer?, propname: Pcwstr, value: Int): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteLong((propbag?.value ?: 0L), (propname?.value ?: 0L), value)

public actual fun pspropertyBagWritePointl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePointl((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagWritePoints(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePoints((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagWritePropertyKey(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePropertyKey((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagWriteRectl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteRectl((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagWriteShort(propbag: COpaquePointer?, propname: Pcwstr, value: Short): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteShort((propbag?.value ?: 0L), (propname?.value ?: 0L), value)

public actual fun pspropertyBagWriteStr(propbag: COpaquePointer?, propname: Pcwstr, value: Pcwstr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteStr((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagWriteStream(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteStream((propbag?.value ?: 0L), (propname?.value ?: 0L), (value?.value ?: 0L))

public actual fun pspropertyBagWriteUlonglong(propbag: COpaquePointer?, propname: Pcwstr, value: ULong): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteUlonglong((propbag?.value ?: 0L), (propname?.value ?: 0L), value.toLong())

public actual fun pspropertyBagWriteUnknown(propbag: COpaquePointer?, propname: Pcwstr, punk: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteUnknown((propbag?.value ?: 0L), (propname?.value ?: 0L), (punk?.value ?: 0L))

public actual fun pSPropertyKeyFromString(pszstring: Pcwstr, pkey: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSPropertyKeyFromString((pszstring?.value ?: 0L), (pkey?.value ?: 0L))

public actual fun pSRefreshPropertySchema(): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSRefreshPropertySchema()

public actual fun pSRegisterPropertySchema(pszpath: Pcwstr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSRegisterPropertySchema((pszpath?.value ?: 0L))

public actual fun pSSetPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, propvar: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSSetPropertyValue((pps?.value ?: 0L), (ppd?.value ?: 0L), (propvar?.value ?: 0L))

public actual fun pSStringFromPropertyKey(pkey: COpaquePointer?, psz: Pwstr, cch: UInt): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSStringFromPropertyKey((pkey?.value ?: 0L), (psz?.value ?: 0L), cch.toInt())

public actual fun pSUnregisterPropertySchema(pszpath: Pcwstr): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pSUnregisterPropertySchema((pszpath?.value ?: 0L))

public actual fun pifMgrCloseProperties(hprops: Handle, flopt: UInt): Handle =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pifMgrCloseProperties((hprops?.value ?: 0L), flopt.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pifMgrGetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: COpaquePointer?, cbprops: Int, flopt: UInt): Int =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pifMgrGetProperties((hprops?.value ?: 0L), (pszgroup?.value ?: 0L), (lpprops?.value ?: 0L), cbprops, flopt.toInt())

public actual fun pifMgrOpenProperties(pszapp: Pcwstr, pszpif: Pcwstr, hinf: UInt, flopt: UInt): Handle =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pifMgrOpenProperties((pszapp?.value ?: 0L), (pszpif?.value ?: 0L), hinf.toInt(), flopt.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pifMgrSetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: COpaquePointer?, cbprops: Int, flopt: UInt): Int =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_pifMgrSetProperties((hprops?.value ?: 0L), (pszgroup?.value ?: 0L), (lpprops?.value ?: 0L), cbprops, flopt.toInt())

public actual fun sHAddDefaultPropertiesByExt(pszext: Pcwstr, ppropstore: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_sHAddDefaultPropertiesByExt((pszext?.value ?: 0L), (ppropstore?.value ?: 0L))

public actual fun sHGetPropertyStoreForWindow(hwnd: Hwnd, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreForWindow((hwnd?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHGetPropertyStoreFromIDList(pidl: COpaquePointer?, flags: Getpropertystoreflags, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreFromIDList((pidl?.value ?: 0L), flags, (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHGetPropertyStoreFromParsingName(pszpath: Pcwstr, pbc: COpaquePointer?, flags: Getpropertystoreflags, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreFromParsingName((pszpath?.value ?: 0L), (pbc?.value ?: 0L), flags, (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHPropStgCreate(psstg: COpaquePointer?, fmtid: COpaquePointer?, pclsid: COpaquePointer?, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: COpaquePointer?, pucodepage: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgCreate((psstg?.value ?: 0L), (fmtid?.value ?: 0L), (pclsid?.value ?: 0L), grfflags.toInt(), grfmode.toInt(), dwdisposition.toInt(), (ppstg?.value ?: 0L), (pucodepage?.value ?: 0L))

public actual fun sHPropStgReadMultiple(pps: COpaquePointer?, ucodepage: UInt, cpspec: UInt, rgpspec: COpaquePointer?, rgvar: COpaquePointer?): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgReadMultiple((pps?.value ?: 0L), ucodepage.toInt(), cpspec.toInt(), (rgpspec?.value ?: 0L), (rgvar?.value ?: 0L))

public actual fun sHPropStgWriteMultiple(pps: COpaquePointer?, pucodepage: COpaquePointer?, cpspec: UInt, rgpspec: COpaquePointer?, rgvar: COpaquePointer?, propidnamefirst: UInt): Hresult =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgWriteMultiple((pps?.value ?: 0L), (pucodepage?.value ?: 0L), cpspec.toInt(), (rgpspec?.value ?: 0L), (rgvar?.value ?: 0L), propidnamefirst.toInt())
