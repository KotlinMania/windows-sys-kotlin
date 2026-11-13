@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun pSCoerceToCanonicalValue(key: ConstPtr, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCoerceToCanonicalValue")

public actual fun pSCreateAdapterFromPropertyStore(pps: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreateAdapterFromPropertyStore")

public actual fun pSCreateDelayedMultiplexPropertyStore(flags: Getpropertystoreflags, pdpsf: MutPtr, rgstoreids: ConstPtr, cstores: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreateDelayedMultiplexPropertyStore")

public actual fun pSCreateMemoryPropertyStore(riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreateMemoryPropertyStore")

public actual fun pSCreateMultiplexPropertyStore(prgpunkstores: ConstPtr, cstores: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreateMultiplexPropertyStore")

public actual fun pSCreatePropertyChangeArray(rgpropkey: ConstPtr, rgflags: ConstPtr, rgpropvar: ConstPtr, cchanges: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyChangeArray")

public actual fun pSCreatePropertyStoreFromObject(punk: MutPtr, grfmode: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromObject")

public actual fun pSCreatePropertyStoreFromPropertySetStorage(ppss: MutPtr, grfmode: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromPropertySetStorage")

public actual fun pSCreateSimplePropertyChange(flags: PkaFlags, key: ConstPtr, propvar: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreateSimplePropertyChange")

public actual fun pSEnumeratePropertyDescriptions(filteron: PropdescEnumfilter, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSEnumeratePropertyDescriptions")

public actual fun pSFormatForDisplay(propkey: ConstPtr, propvar: ConstPtr, pdfflags: PropdescFormatFlags, pwsztext: Pwstr, cchtext: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplay")

public actual fun pSFormatForDisplayAlloc(key: ConstPtr, propvar: ConstPtr, pdff: PropdescFormatFlags, ppszdisplay: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplayAlloc")

public actual fun pSFormatPropertyValue(pps: MutPtr, ppd: MutPtr, pdff: PropdescFormatFlags, ppszdisplay: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSFormatPropertyValue")

public actual fun pSGetImageReferenceForValue(propkey: ConstPtr, propvar: ConstPtr, ppszimageres: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetImageReferenceForValue")

public actual fun pSGetItemPropertyHandler(punkitem: MutPtr, freadwrite: Bool, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandler")

public actual fun pSGetItemPropertyHandlerWithCreateObject(punkitem: MutPtr, freadwrite: Bool, punkcreateobject: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandlerWithCreateObject")

public actual fun pSGetNameFromPropertyKey(propkey: ConstPtr, ppszcanonicalname: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetNameFromPropertyKey")

public actual fun pSGetNamedPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, pszname: Pcwstr, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetNamedPropertyFromPropertyStorage")

public actual fun pSGetPropertyDescription(propkey: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescription")

public actual fun pSGetPropertyDescriptionByName(pszcanonicalname: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionByName")

public actual fun pSGetPropertyDescriptionListFromString(pszproplist: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionListFromString")

public actual fun pSGetPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, rpkey: ConstPtr, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyFromPropertyStorage")

public actual fun pSGetPropertyKeyFromName(pszname: Pcwstr, ppropkey: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyKeyFromName")

public actual fun pSGetPropertySystem(riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetPropertySystem")

public actual fun pSGetPropertyValue(pps: MutPtr, ppd: MutPtr, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyValue")

public actual fun pSLookupPropertyHandlerCLSID(pszfilepath: Pcwstr, pclsid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSLookupPropertyHandlerCLSID")

public actual fun pspropertyBagDelete(propbag: MutPtr, propname: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagDelete")

public actual fun pspropertyBagReadBool(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBool")

public actual fun pspropertyBagReadBstr(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBstr")

public actual fun pspropertyBagReadDword(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadDword")

public actual fun pspropertyBagReadGuid(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadGuid")

public actual fun pspropertyBagReadInt(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadInt")

public actual fun pspropertyBagReadLong(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadLong")

public actual fun pspropertyBagReadPointl(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPointl")

public actual fun pspropertyBagReadPoints(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPoints")

public actual fun pspropertyBagReadPropertyKey(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPropertyKey")

public actual fun pspropertyBagReadRectl(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadRectl")

public actual fun pspropertyBagReadShort(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadShort")

public actual fun pspropertyBagReadStr(propbag: MutPtr, propname: Pcwstr, value: Pwstr, charactercount: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStr")

public actual fun pspropertyBagReadStrAlloc(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStrAlloc")

public actual fun pspropertyBagReadStream(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStream")

public actual fun pspropertyBagReadType(propbag: MutPtr, propname: Pcwstr, variable: MutPtr, type: Varenum): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadType")

public actual fun pspropertyBagReadUlonglong(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUlonglong")

public actual fun pspropertyBagReadUnknown(propbag: MutPtr, propname: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUnknown")

public actual fun pspropertyBagWriteBool(propbag: MutPtr, propname: Pcwstr, value: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBool")

public actual fun pspropertyBagWriteBstr(propbag: MutPtr, propname: Pcwstr, value: Bstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBstr")

public actual fun pspropertyBagWriteDword(propbag: MutPtr, propname: Pcwstr, value: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteDword")

public actual fun pspropertyBagWriteGuid(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteGuid")

public actual fun pspropertyBagWriteInt(propbag: MutPtr, propname: Pcwstr, value: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteInt")

public actual fun pspropertyBagWriteLong(propbag: MutPtr, propname: Pcwstr, value: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteLong")

public actual fun pspropertyBagWritePointl(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePointl")

public actual fun pspropertyBagWritePoints(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePoints")

public actual fun pspropertyBagWritePropertyKey(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePropertyKey")

public actual fun pspropertyBagWriteRectl(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteRectl")

public actual fun pspropertyBagWriteShort(propbag: MutPtr, propname: Pcwstr, value: Short): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteShort")

public actual fun pspropertyBagWriteStr(propbag: MutPtr, propname: Pcwstr, value: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStr")

public actual fun pspropertyBagWriteStream(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStream")

public actual fun pspropertyBagWriteUlonglong(propbag: MutPtr, propname: Pcwstr, value: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUlonglong")

public actual fun pspropertyBagWriteUnknown(propbag: MutPtr, propname: Pcwstr, punk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUnknown")

public actual fun pSPropertyKeyFromString(pszstring: Pcwstr, pkey: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSPropertyKeyFromString")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema")
private external fun wasiWindowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema(): Int

public actual fun pSRefreshPropertySchema(): Hresult =
    wasiWindowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema()

public actual fun pSRegisterPropertySchema(pszpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSRegisterPropertySchema")

public actual fun pSSetPropertyValue(pps: MutPtr, ppd: MutPtr, propvar: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSSetPropertyValue")

public actual fun pSStringFromPropertyKey(pkey: ConstPtr, psz: Pwstr, cch: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSStringFromPropertyKey")

public actual fun pSUnregisterPropertySchema(pszpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSUnregisterPropertySchema")

public actual fun pifMgrCloseProperties(hprops: Handle, flopt: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPifMgrCloseProperties")

public actual fun pifMgrGetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: MutPtr, cbprops: Int, flopt: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPifMgrGetProperties")

public actual fun pifMgrOpenProperties(pszapp: Pcwstr, pszpif: Pcwstr, hinf: UInt, flopt: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPifMgrOpenProperties")

public actual fun pifMgrSetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: ConstPtr, cbprops: Int, flopt: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPifMgrSetProperties")

public actual fun sHAddDefaultPropertiesByExt(pszext: Pcwstr, ppropstore: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemSHAddDefaultPropertiesByExt")

public actual fun sHGetPropertyStoreForWindow(hwnd: Hwnd, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreForWindow")

public actual fun sHGetPropertyStoreFromIDList(pidl: ConstPtr, flags: Getpropertystoreflags, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromIDList")

public actual fun sHGetPropertyStoreFromParsingName(pszpath: Pcwstr, pbc: MutPtr, flags: Getpropertystoreflags, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromParsingName")

public actual fun sHPropStgCreate(psstg: MutPtr, fmtid: ConstPtr, pclsid: ConstPtr, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: MutPtr, pucodepage: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemSHPropStgCreate")

public actual fun sHPropStgReadMultiple(pps: MutPtr, ucodepage: UInt, cpspec: UInt, rgpspec: ConstPtr, rgvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemSHPropStgReadMultiple")

public actual fun sHPropStgWriteMultiple(pps: MutPtr, pucodepage: MutPtr, cpspec: UInt, rgpspec: ConstPtr, rgvar: MutPtr, propidnamefirst: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemSHPropStgWriteMultiple")
