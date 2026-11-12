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
import io.github.kotlinmania.windowssys.windows.win32.system.Variant

private val windowsWin32UiShellPropertiessystemNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun pSCoerceToCanonicalValue(key: ConstPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCoerceToCanonicalValue(key.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateAdapterFromPropertyStore(pps: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreateAdapterFromPropertyStore(pps.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateDelayedMultiplexPropertyStore(flags: Getpropertystoreflags, pdpsf: MutPtr, rgstoreids: ConstPtr, cstores: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreateDelayedMultiplexPropertyStore(flags, pdpsf.rawAddress.toString(), rgstoreids.rawAddress.toString(), cstores.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateMemoryPropertyStore(riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreateMemoryPropertyStore(riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateMultiplexPropertyStore(prgpunkstores: ConstPtr, cstores: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreateMultiplexPropertyStore(prgpunkstores.rawAddress.toString(), cstores.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreatePropertyChangeArray(rgpropkey: ConstPtr, rgflags: ConstPtr, rgpropvar: ConstPtr, cchanges: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyChangeArray(rgpropkey.rawAddress.toString(), rgflags.rawAddress.toString(), rgpropvar.rawAddress.toString(), cchanges.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreatePropertyStoreFromObject(punk: MutPtr, grfmode: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromObject(punk.rawAddress.toString(), grfmode.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreatePropertyStoreFromPropertySetStorage(ppss: MutPtr, grfmode: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromPropertySetStorage(ppss.rawAddress.toString(), grfmode.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateSimplePropertyChange(flags: PkaFlags, key: ConstPtr, propvar: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreateSimplePropertyChange(flags, key.rawAddress.toString(), propvar.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSEnumeratePropertyDescriptions(filteron: PropdescEnumfilter, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSEnumeratePropertyDescriptions(filteron, riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSFormatForDisplay(propkey: ConstPtr, propvar: ConstPtr, pdfflags: PropdescFormatFlags, pwsztext: Pwstr, cchtext: UInt): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplay(propkey.rawAddress.toString(), propvar.rawAddress.toString(), pdfflags, pwsztext.rawAddress.toString(), cchtext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSFormatForDisplayAlloc(key: ConstPtr, propvar: ConstPtr, pdff: PropdescFormatFlags, ppszdisplay: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplayAlloc(key.rawAddress.toString(), propvar.rawAddress.toString(), pdff, ppszdisplay.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSFormatPropertyValue(pps: MutPtr, ppd: MutPtr, pdff: PropdescFormatFlags, ppszdisplay: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSFormatPropertyValue(pps.rawAddress.toString(), ppd.rawAddress.toString(), pdff, ppszdisplay.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetImageReferenceForValue(propkey: ConstPtr, propvar: ConstPtr, ppszimageres: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetImageReferenceForValue(propkey.rawAddress.toString(), propvar.rawAddress.toString(), ppszimageres.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetItemPropertyHandler(punkitem: MutPtr, freadwrite: Bool, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandler(punkitem.rawAddress.toString(), freadwrite, riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetItemPropertyHandlerWithCreateObject(punkitem: MutPtr, freadwrite: Bool, punkcreateobject: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandlerWithCreateObject(punkitem.rawAddress.toString(), freadwrite, punkcreateobject.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetNameFromPropertyKey(propkey: ConstPtr, ppszcanonicalname: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetNameFromPropertyKey(propkey.rawAddress.toString(), ppszcanonicalname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetNamedPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, pszname: Pcwstr, ppropvar: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetNamedPropertyFromPropertyStorage(psps.toString(), cb.toInt(), pszname.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyDescription(propkey: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescription(propkey.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyDescriptionByName(pszcanonicalname: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionByName(pszcanonicalname.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyDescriptionListFromString(pszproplist: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionListFromString(pszproplist.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, rpkey: ConstPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyFromPropertyStorage(psps.toString(), cb.toInt(), rpkey.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyKeyFromName(pszname: Pcwstr, ppropkey: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyKeyFromName(pszname.rawAddress.toString(), ppropkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertySystem(riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertySystem(riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyValue(pps: MutPtr, ppd: MutPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyValue(pps.rawAddress.toString(), ppd.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSLookupPropertyHandlerCLSID(pszfilepath: Pcwstr, pclsid: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSLookupPropertyHandlerCLSID(pszfilepath.rawAddress.toString(), pclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagDelete(propbag: MutPtr, propname: Pcwstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagDelete(propbag.rawAddress.toString(), propname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadBool(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBool(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadBstr(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBstr(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadDword(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadDword(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadGuid(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadGuid(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadInt(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadInt(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadLong(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadLong(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadPointl(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPointl(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadPoints(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPoints(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadPropertyKey(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPropertyKey(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadRectl(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadRectl(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadShort(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadShort(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadStr(propbag: MutPtr, propname: Pcwstr, value: Pwstr, charactercount: Int): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStr(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString(), charactercount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadStrAlloc(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStrAlloc(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadStream(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStream(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadType(propbag: MutPtr, propname: Pcwstr, variable: MutPtr, type: Variant.Varenum): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadType(propbag.rawAddress.toString(), propname.rawAddress.toString(), variable.rawAddress.toString(), type.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadUlonglong(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUlonglong(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadUnknown(propbag: MutPtr, propname: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUnknown(propbag.rawAddress.toString(), propname.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteBool(propbag: MutPtr, propname: Pcwstr, value: Bool): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBool(propbag.rawAddress.toString(), propname.rawAddress.toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteBstr(propbag: MutPtr, propname: Pcwstr, value: Bstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBstr(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteDword(propbag: MutPtr, propname: Pcwstr, value: UInt): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteDword(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteGuid(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteGuid(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteInt(propbag: MutPtr, propname: Pcwstr, value: Int): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteInt(propbag.rawAddress.toString(), propname.rawAddress.toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteLong(propbag: MutPtr, propname: Pcwstr, value: Int): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteLong(propbag.rawAddress.toString(), propname.rawAddress.toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWritePointl(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePointl(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWritePoints(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePoints(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWritePropertyKey(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePropertyKey(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteRectl(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteRectl(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteShort(propbag: MutPtr, propname: Pcwstr, value: Short): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteShort(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteStr(propbag: MutPtr, propname: Pcwstr, value: Pcwstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStr(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteStream(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStream(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteUlonglong(propbag: MutPtr, propname: Pcwstr, value: ULong): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUlonglong(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteUnknown(propbag: MutPtr, propname: Pcwstr, punk: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUnknown(propbag.rawAddress.toString(), propname.rawAddress.toString(), punk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSPropertyKeyFromString(pszstring: Pcwstr, pkey: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSPropertyKeyFromString(pszstring.rawAddress.toString(), pkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSRefreshPropertySchema(): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSRegisterPropertySchema(pszpath: Pcwstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSRegisterPropertySchema(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSSetPropertyValue(pps: MutPtr, ppd: MutPtr, propvar: ConstPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSSetPropertyValue(pps.rawAddress.toString(), ppd.rawAddress.toString(), propvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSStringFromPropertyKey(pkey: ConstPtr, psz: Pwstr, cch: UInt): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSStringFromPropertyKey(pkey.rawAddress.toString(), psz.rawAddress.toString(), cch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSUnregisterPropertySchema(pszpath: Pcwstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSUnregisterPropertySchema(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrCloseProperties(hprops: Handle, flopt: UInt): Handle =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) MutPtr((windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPifMgrCloseProperties(hprops.rawAddress.toString(), flopt.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrGetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: MutPtr, cbprops: Int, flopt: UInt): Int =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPifMgrGetProperties(hprops.rawAddress.toString(), pszgroup.rawAddress.toString(), lpprops.rawAddress.toString(), cbprops, flopt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrOpenProperties(pszapp: Pcwstr, pszpif: Pcwstr, hinf: UInt, flopt: UInt): Handle =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) MutPtr((windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPifMgrOpenProperties(pszapp.rawAddress.toString(), pszpif.rawAddress.toString(), hinf.toInt(), flopt.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrSetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: ConstPtr, cbprops: Int, flopt: UInt): Int =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPifMgrSetProperties(hprops.rawAddress.toString(), pszgroup.rawAddress.toString(), lpprops.rawAddress.toString(), cbprops, flopt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAddDefaultPropertiesByExt(pszext: Pcwstr, ppropstore: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemSHAddDefaultPropertiesByExt(pszext.rawAddress.toString(), ppropstore.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPropertyStoreForWindow(hwnd: Hwnd, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreForWindow(hwnd.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPropertyStoreFromIDList(pidl: ConstPtr, flags: Getpropertystoreflags, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromIDList(pidl.rawAddress.toString(), flags, riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPropertyStoreFromParsingName(pszpath: Pcwstr, pbc: MutPtr, flags: Getpropertystoreflags, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromParsingName(pszpath.rawAddress.toString(), pbc.rawAddress.toString(), flags, riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPropStgCreate(psstg: MutPtr, fmtid: ConstPtr, pclsid: ConstPtr, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: MutPtr, pucodepage: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemSHPropStgCreate(psstg.rawAddress.toString(), fmtid.rawAddress.toString(), pclsid.rawAddress.toString(), grfflags.toInt(), grfmode.toInt(), dwdisposition.toInt(), ppstg.rawAddress.toString(), pucodepage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPropStgReadMultiple(pps: MutPtr, ucodepage: UInt, cpspec: UInt, rgpspec: ConstPtr, rgvar: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemSHPropStgReadMultiple(pps.rawAddress.toString(), ucodepage.toInt(), cpspec.toInt(), rgpspec.rawAddress.toString(), rgvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPropStgWriteMultiple(pps: MutPtr, pucodepage: MutPtr, cpspec: UInt, rgpspec: ConstPtr, rgvar: MutPtr, propidnamefirst: UInt): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemSHPropStgWriteMultiple(pps.rawAddress.toString(), pucodepage.rawAddress.toString(), cpspec.toInt(), rgpspec.rawAddress.toString(), rgvar.rawAddress.toString(), propidnamefirst.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
