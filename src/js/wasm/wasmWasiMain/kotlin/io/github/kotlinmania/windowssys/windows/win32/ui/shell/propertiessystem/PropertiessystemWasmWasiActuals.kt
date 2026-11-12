@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Pointl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Points
import io.github.kotlinmania.windowssys.windows.win32.foundation.Propertykey
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl
import io.github.kotlinmania.windowssys.windows.win32.system.Variant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propspec
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Itemidlist

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun pSCoerceToCanonicalValue(key: ConstPtr<Propertykey>, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCoerceToCanonicalValue")

public actual fun pSCreateAdapterFromPropertyStore(pps: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreateAdapterFromPropertyStore")

public actual fun pSCreateDelayedMultiplexPropertyStore(flags: Getpropertystoreflags, pdpsf: MutPtr<CVoid>, rgstoreids: ConstPtr<UInt>, cstores: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreateDelayedMultiplexPropertyStore")

public actual fun pSCreateMemoryPropertyStore(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreateMemoryPropertyStore")

public actual fun pSCreateMultiplexPropertyStore(prgpunkstores: ConstPtr<MutPtr<CVoid>>, cstores: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreateMultiplexPropertyStore")

public actual fun pSCreatePropertyChangeArray(rgpropkey: ConstPtr<Propertykey>, rgflags: ConstPtr<PkaFlags>, rgpropvar: ConstPtr<Propvariant>, cchanges: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyChangeArray")

public actual fun pSCreatePropertyStoreFromObject(punk: MutPtr<CVoid>, grfmode: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromObject")

public actual fun pSCreatePropertyStoreFromPropertySetStorage(ppss: MutPtr<CVoid>, grfmode: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromPropertySetStorage")

public actual fun pSCreateSimplePropertyChange(flags: PkaFlags, key: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSCreateSimplePropertyChange")

public actual fun pSEnumeratePropertyDescriptions(filteron: PropdescEnumfilter, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSEnumeratePropertyDescriptions")

public actual fun pSFormatForDisplay(propkey: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, pdfflags: PropdescFormatFlags, pwsztext: Pwstr, cchtext: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplay")

public actual fun pSFormatForDisplayAlloc(key: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, pdff: PropdescFormatFlags, ppszdisplay: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplayAlloc")

public actual fun pSFormatPropertyValue(pps: MutPtr<CVoid>, ppd: MutPtr<CVoid>, pdff: PropdescFormatFlags, ppszdisplay: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSFormatPropertyValue")

public actual fun pSGetImageReferenceForValue(propkey: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, ppszimageres: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetImageReferenceForValue")

public actual fun pSGetItemPropertyHandler(punkitem: MutPtr<CVoid>, freadwrite: Bool, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandler")

public actual fun pSGetItemPropertyHandlerWithCreateObject(punkitem: MutPtr<CVoid>, freadwrite: Bool, punkcreateobject: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandlerWithCreateObject")

public actual fun pSGetNameFromPropertyKey(propkey: ConstPtr<Propertykey>, ppszcanonicalname: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetNameFromPropertyKey")

public actual fun pSGetNamedPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, pszname: Pcwstr, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetNamedPropertyFromPropertyStorage")

public actual fun pSGetPropertyDescription(propkey: ConstPtr<Propertykey>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescription")

public actual fun pSGetPropertyDescriptionByName(pszcanonicalname: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionByName")

public actual fun pSGetPropertyDescriptionListFromString(pszproplist: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionListFromString")

public actual fun pSGetPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, rpkey: ConstPtr<Propertykey>, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyFromPropertyStorage")

public actual fun pSGetPropertyKeyFromName(pszname: Pcwstr, ppropkey: MutPtr<Propertykey>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyKeyFromName")

public actual fun pSGetPropertySystem(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetPropertySystem")

public actual fun pSGetPropertyValue(pps: MutPtr<CVoid>, ppd: MutPtr<CVoid>, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyValue")

public actual fun pSLookupPropertyHandlerCLSID(pszfilepath: Pcwstr, pclsid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSLookupPropertyHandlerCLSID")

public actual fun pspropertyBagDelete(propbag: MutPtr<CVoid>, propname: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagDelete")

public actual fun pspropertyBagReadBool(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBool")

public actual fun pspropertyBagReadBstr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Bstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBstr")

public actual fun pspropertyBagReadDword(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadDword")

public actual fun pspropertyBagReadGuid(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadGuid")

public actual fun pspropertyBagReadInt(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadInt")

public actual fun pspropertyBagReadLong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadLong")

public actual fun pspropertyBagReadPointl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Pointl>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPointl")

public actual fun pspropertyBagReadPoints(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Points>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPoints")

public actual fun pspropertyBagReadPropertyKey(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Propertykey>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPropertyKey")

public actual fun pspropertyBagReadRectl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Rectl>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadRectl")

public actual fun pspropertyBagReadShort(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Short>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadShort")

public actual fun pspropertyBagReadStr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Pwstr, charactercount: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStr")

public actual fun pspropertyBagReadStrAlloc(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStrAlloc")

public actual fun pspropertyBagReadStream(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStream")

public actual fun pspropertyBagReadType(propbag: MutPtr<CVoid>, propname: Pcwstr, variable: MutPtr<Variant.Variant>, type: Variant.Varenum): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadType")

public actual fun pspropertyBagReadUlonglong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUlonglong")

public actual fun pspropertyBagReadUnknown(propbag: MutPtr<CVoid>, propname: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUnknown")

public actual fun pspropertyBagWriteBool(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBool")

public actual fun pspropertyBagWriteBstr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Bstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBstr")

public actual fun pspropertyBagWriteDword(propbag: MutPtr<CVoid>, propname: Pcwstr, value: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteDword")

public actual fun pspropertyBagWriteGuid(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteGuid")

public actual fun pspropertyBagWriteInt(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteInt")

public actual fun pspropertyBagWriteLong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteLong")

public actual fun pspropertyBagWritePointl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Pointl>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePointl")

public actual fun pspropertyBagWritePoints(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Points>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePoints")

public actual fun pspropertyBagWritePropertyKey(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Propertykey>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePropertyKey")

public actual fun pspropertyBagWriteRectl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Rectl>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteRectl")

public actual fun pspropertyBagWriteShort(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Short): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteShort")

public actual fun pspropertyBagWriteStr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStr")

public actual fun pspropertyBagWriteStream(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStream")

public actual fun pspropertyBagWriteUlonglong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUlonglong")

public actual fun pspropertyBagWriteUnknown(propbag: MutPtr<CVoid>, propname: Pcwstr, punk: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUnknown")

public actual fun pSPropertyKeyFromString(pszstring: Pcwstr, pkey: MutPtr<Propertykey>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSPropertyKeyFromString")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema")
private external fun wasiWindowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema(): Int

public actual fun pSRefreshPropertySchema(): Hresult =
    wasiWindowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema().toInt()

public actual fun pSRegisterPropertySchema(pszpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSRegisterPropertySchema")

public actual fun pSSetPropertyValue(pps: MutPtr<CVoid>, ppd: MutPtr<CVoid>, propvar: ConstPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSSetPropertyValue")

public actual fun pSStringFromPropertyKey(pkey: ConstPtr<Propertykey>, psz: Pwstr, cch: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSStringFromPropertyKey")

public actual fun pSUnregisterPropertySchema(pszpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPSUnregisterPropertySchema")

public actual fun pifMgrCloseProperties(hprops: Handle, flopt: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPifMgrCloseProperties")

public actual fun pifMgrGetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: MutPtr<CVoid>, cbprops: Int, flopt: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPifMgrGetProperties")

public actual fun pifMgrOpenProperties(pszapp: Pcwstr, pszpif: Pcwstr, hinf: UInt, flopt: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPifMgrOpenProperties")

public actual fun pifMgrSetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: ConstPtr<CVoid>, cbprops: Int, flopt: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemPifMgrSetProperties")

public actual fun sHAddDefaultPropertiesByExt(pszext: Pcwstr, ppropstore: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemSHAddDefaultPropertiesByExt")

public actual fun sHGetPropertyStoreForWindow(hwnd: Hwnd, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreForWindow")

public actual fun sHGetPropertyStoreFromIDList(pidl: ConstPtr<Itemidlist>, flags: Getpropertystoreflags, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromIDList")

public actual fun sHGetPropertyStoreFromParsingName(pszpath: Pcwstr, pbc: MutPtr<CVoid>, flags: Getpropertystoreflags, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromParsingName")

public actual fun sHPropStgCreate(psstg: MutPtr<CVoid>, fmtid: ConstPtr<Guid>, pclsid: ConstPtr<Guid>, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: MutPtr<MutPtr<CVoid>>, pucodepage: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemSHPropStgCreate")

public actual fun sHPropStgReadMultiple(pps: MutPtr<CVoid>, ucodepage: UInt, cpspec: UInt, rgpspec: ConstPtr<Propspec>, rgvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemSHPropStgReadMultiple")

public actual fun sHPropStgWriteMultiple(pps: MutPtr<CVoid>, pucodepage: MutPtr<UInt>, cpspec: UInt, rgpspec: ConstPtr<Propspec>, rgvar: MutPtr<Propvariant>, propidnamefirst: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiShellPropertiessystemSHPropStgWriteMultiple")
