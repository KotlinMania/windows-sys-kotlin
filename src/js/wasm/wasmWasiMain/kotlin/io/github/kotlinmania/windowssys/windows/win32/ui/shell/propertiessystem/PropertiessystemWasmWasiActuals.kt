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

public actual fun pSCoerceToCanonicalValue(key: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSCreateAdapterFromPropertyStore(pps: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSCreateDelayedMultiplexPropertyStore(flags: Getpropertystoreflags, pdpsf: COpaquePointer?, rgstoreids: COpaquePointer?, cstores: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSCreateMemoryPropertyStore(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSCreateMultiplexPropertyStore(prgpunkstores: COpaquePointer?, cstores: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSCreatePropertyChangeArray(rgpropkey: COpaquePointer?, rgflags: COpaquePointer?, rgpropvar: COpaquePointer?, cchanges: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSCreatePropertyStoreFromObject(punk: COpaquePointer?, grfmode: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSCreatePropertyStoreFromPropertySetStorage(ppss: COpaquePointer?, grfmode: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSCreateSimplePropertyChange(flags: PkaFlags, key: COpaquePointer?, propvar: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSEnumeratePropertyDescriptions(filteron: PropdescEnumfilter, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSFormatForDisplay(propkey: COpaquePointer?, propvar: COpaquePointer?, pdfflags: PropdescFormatFlags, pwsztext: Pwstr, cchtext: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSFormatForDisplayAlloc(key: COpaquePointer?, propvar: COpaquePointer?, pdff: PropdescFormatFlags, ppszdisplay: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSFormatPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, pdff: PropdescFormatFlags, ppszdisplay: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSGetImageReferenceForValue(propkey: COpaquePointer?, propvar: COpaquePointer?, ppszimageres: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSGetItemPropertyHandler(punkitem: COpaquePointer?, freadwrite: Bool, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSGetItemPropertyHandlerWithCreateObject(punkitem: COpaquePointer?, freadwrite: Bool, punkcreateobject: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSGetNameFromPropertyKey(propkey: COpaquePointer?, ppszcanonicalname: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSGetNamedPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, pszname: Pcwstr, ppropvar: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSGetPropertyDescription(propkey: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSGetPropertyDescriptionByName(pszcanonicalname: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSGetPropertyDescriptionListFromString(pszproplist: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSGetPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, rpkey: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSGetPropertyKeyFromName(pszname: Pcwstr, ppropkey: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSGetPropertySystem(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSGetPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSLookupPropertyHandlerCLSID(pszfilepath: Pcwstr, pclsid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagDelete(propbag: COpaquePointer?, propname: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadBool(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadBstr(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadDword(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadGuid(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadInt(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadLong(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadPointl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadPoints(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadPropertyKey(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadRectl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadShort(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadStr(propbag: COpaquePointer?, propname: Pcwstr, value: Pwstr, charactercount: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadStrAlloc(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadStream(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadType(propbag: COpaquePointer?, propname: Pcwstr, variable: COpaquePointer?, type: Varenum): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadUlonglong(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagReadUnknown(propbag: COpaquePointer?, propname: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWriteBool(propbag: COpaquePointer?, propname: Pcwstr, value: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWriteBstr(propbag: COpaquePointer?, propname: Pcwstr, value: Bstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWriteDword(propbag: COpaquePointer?, propname: Pcwstr, value: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWriteGuid(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWriteInt(propbag: COpaquePointer?, propname: Pcwstr, value: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWriteLong(propbag: COpaquePointer?, propname: Pcwstr, value: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWritePointl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWritePoints(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWritePropertyKey(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWriteRectl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWriteShort(propbag: COpaquePointer?, propname: Pcwstr, value: Short): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWriteStr(propbag: COpaquePointer?, propname: Pcwstr, value: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWriteStream(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWriteUlonglong(propbag: COpaquePointer?, propname: Pcwstr, value: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pspropertyBagWriteUnknown(propbag: COpaquePointer?, propname: Pcwstr, punk: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSPropertyKeyFromString(pszstring: Pcwstr, pkey: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSRefreshPropertySchema(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSRegisterPropertySchema(pszpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSSetPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, propvar: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSStringFromPropertyKey(pkey: COpaquePointer?, psz: Pwstr, cch: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pSUnregisterPropertySchema(pszpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pifMgrCloseProperties(hprops: Handle, flopt: UInt): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pifMgrGetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: COpaquePointer?, cbprops: Int, flopt: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pifMgrOpenProperties(pszapp: Pcwstr, pszpif: Pcwstr, hinf: UInt, flopt: UInt): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pifMgrSetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: COpaquePointer?, cbprops: Int, flopt: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHAddDefaultPropertiesByExt(pszext: Pcwstr, ppropstore: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetPropertyStoreForWindow(hwnd: Hwnd, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetPropertyStoreFromIDList(pidl: COpaquePointer?, flags: Getpropertystoreflags, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetPropertyStoreFromParsingName(pszpath: Pcwstr, pbc: COpaquePointer?, flags: Getpropertystoreflags, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHPropStgCreate(psstg: COpaquePointer?, fmtid: COpaquePointer?, pclsid: COpaquePointer?, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: COpaquePointer?, pucodepage: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHPropStgReadMultiple(pps: COpaquePointer?, ucodepage: UInt, cpspec: UInt, rgpspec: COpaquePointer?, rgvar: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHPropStgWriteMultiple(pps: COpaquePointer?, pucodepage: COpaquePointer?, cpspec: UInt, rgpspec: COpaquePointer?, rgvar: COpaquePointer?, propidnamefirst: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
