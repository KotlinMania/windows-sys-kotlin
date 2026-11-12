@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32UiShellPropertiessystemNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun pSCoerceToCanonicalValue(key: ConstPtr<Propertykey>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCoerceToCanonicalValue(key.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateAdapterFromPropertyStore(pps: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreateAdapterFromPropertyStore(pps.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateDelayedMultiplexPropertyStore(flags: Getpropertystoreflags, pdpsf: MutPtr<CVoid>, rgstoreids: ConstPtr<UInt>, cstores: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreateDelayedMultiplexPropertyStore(flags, pdpsf.rawAddress.toString(), rgstoreids.rawAddress.toString(), cstores.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateMemoryPropertyStore(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreateMemoryPropertyStore(riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateMultiplexPropertyStore(prgpunkstores: ConstPtr<MutPtr<CVoid>>, cstores: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreateMultiplexPropertyStore(prgpunkstores.rawAddress.toString(), cstores.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreatePropertyChangeArray(rgpropkey: ConstPtr<Propertykey>, rgflags: ConstPtr<PkaFlags>, rgpropvar: ConstPtr<Propvariant>, cchanges: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyChangeArray(rgpropkey.rawAddress.toString(), rgflags.rawAddress.toString(), rgpropvar.rawAddress.toString(), cchanges.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreatePropertyStoreFromObject(punk: MutPtr<CVoid>, grfmode: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromObject(punk.rawAddress.toString(), grfmode.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreatePropertyStoreFromPropertySetStorage(ppss: MutPtr<CVoid>, grfmode: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromPropertySetStorage(ppss.rawAddress.toString(), grfmode.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateSimplePropertyChange(flags: PkaFlags, key: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSCreateSimplePropertyChange(flags, key.rawAddress.toString(), propvar.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSEnumeratePropertyDescriptions(filteron: PropdescEnumfilter, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSEnumeratePropertyDescriptions(filteron, riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSFormatForDisplay(propkey: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, pdfflags: PropdescFormatFlags, pwsztext: Pwstr, cchtext: UInt): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplay(propkey.rawAddress.toString(), propvar.rawAddress.toString(), pdfflags, pwsztext.rawAddress.toString(), cchtext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSFormatForDisplayAlloc(key: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, pdff: PropdescFormatFlags, ppszdisplay: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplayAlloc(key.rawAddress.toString(), propvar.rawAddress.toString(), pdff, ppszdisplay.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSFormatPropertyValue(pps: MutPtr<CVoid>, ppd: MutPtr<CVoid>, pdff: PropdescFormatFlags, ppszdisplay: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSFormatPropertyValue(pps.rawAddress.toString(), ppd.rawAddress.toString(), pdff, ppszdisplay.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetImageReferenceForValue(propkey: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, ppszimageres: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetImageReferenceForValue(propkey.rawAddress.toString(), propvar.rawAddress.toString(), ppszimageres.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetItemPropertyHandler(punkitem: MutPtr<CVoid>, freadwrite: Bool, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandler(punkitem.rawAddress.toString(), freadwrite, riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetItemPropertyHandlerWithCreateObject(punkitem: MutPtr<CVoid>, freadwrite: Bool, punkcreateobject: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandlerWithCreateObject(punkitem.rawAddress.toString(), freadwrite, punkcreateobject.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetNameFromPropertyKey(propkey: ConstPtr<Propertykey>, ppszcanonicalname: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetNameFromPropertyKey(propkey.rawAddress.toString(), ppszcanonicalname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetNamedPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, pszname: Pcwstr, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetNamedPropertyFromPropertyStorage(psps.toString(), cb.toInt(), pszname.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyDescription(propkey: ConstPtr<Propertykey>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescription(propkey.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyDescriptionByName(pszcanonicalname: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionByName(pszcanonicalname.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyDescriptionListFromString(pszproplist: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionListFromString(pszproplist.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, rpkey: ConstPtr<Propertykey>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyFromPropertyStorage(psps.toString(), cb.toInt(), rpkey.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyKeyFromName(pszname: Pcwstr, ppropkey: MutPtr<Propertykey>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyKeyFromName(pszname.rawAddress.toString(), ppropkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertySystem(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertySystem(riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyValue(pps: MutPtr<CVoid>, ppd: MutPtr<CVoid>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyValue(pps.rawAddress.toString(), ppd.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSLookupPropertyHandlerCLSID(pszfilepath: Pcwstr, pclsid: MutPtr<Guid>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSLookupPropertyHandlerCLSID(pszfilepath.rawAddress.toString(), pclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagDelete(propbag: MutPtr<CVoid>, propname: Pcwstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagDelete(propbag.rawAddress.toString(), propname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadBool(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Bool>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBool(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadBstr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Bstr>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBstr(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadDword(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadDword(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadGuid(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Guid>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadGuid(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadInt(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Int>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadInt(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadLong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Int>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadLong(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadPointl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Pointl>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPointl(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadPoints(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Points>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPoints(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadPropertyKey(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Propertykey>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPropertyKey(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadRectl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Rectl>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadRectl(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadShort(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Short>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadShort(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadStr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Pwstr, charactercount: Int): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStr(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString(), charactercount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadStrAlloc(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStrAlloc(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadStream(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStream(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadType(propbag: MutPtr<CVoid>, propname: Pcwstr, variable: MutPtr<Variant.Variant>, type: Variant.Varenum): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadType(propbag.rawAddress.toString(), propname.rawAddress.toString(), variable.rawAddress.toString(), type.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadUlonglong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<ULong>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUlonglong(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadUnknown(propbag: MutPtr<CVoid>, propname: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUnknown(propbag.rawAddress.toString(), propname.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteBool(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Bool): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBool(propbag.rawAddress.toString(), propname.rawAddress.toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteBstr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Bstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBstr(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteDword(propbag: MutPtr<CVoid>, propname: Pcwstr, value: UInt): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteDword(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteGuid(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Guid>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteGuid(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteInt(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Int): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteInt(propbag.rawAddress.toString(), propname.rawAddress.toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteLong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Int): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteLong(propbag.rawAddress.toString(), propname.rawAddress.toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWritePointl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Pointl>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePointl(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWritePoints(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Points>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePoints(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWritePropertyKey(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Propertykey>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePropertyKey(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteRectl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Rectl>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteRectl(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteShort(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Short): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteShort(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteStr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Pcwstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStr(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteStream(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStream(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteUlonglong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ULong): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUlonglong(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteUnknown(propbag: MutPtr<CVoid>, propname: Pcwstr, punk: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUnknown(propbag.rawAddress.toString(), propname.rawAddress.toString(), punk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSPropertyKeyFromString(pszstring: Pcwstr, pkey: MutPtr<Propertykey>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSPropertyKeyFromString(pszstring.rawAddress.toString(), pkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSRefreshPropertySchema(): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSRegisterPropertySchema(pszpath: Pcwstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSRegisterPropertySchema(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSSetPropertyValue(pps: MutPtr<CVoid>, ppd: MutPtr<CVoid>, propvar: ConstPtr<Propvariant>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSSetPropertyValue(pps.rawAddress.toString(), ppd.rawAddress.toString(), propvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSStringFromPropertyKey(pkey: ConstPtr<Propertykey>, psz: Pwstr, cch: UInt): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSStringFromPropertyKey(pkey.rawAddress.toString(), psz.rawAddress.toString(), cch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSUnregisterPropertySchema(pszpath: Pcwstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPSUnregisterPropertySchema(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrCloseProperties(hprops: Handle, flopt: UInt): Handle =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) MutPtr((windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPifMgrCloseProperties(hprops.rawAddress.toString(), flopt.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrGetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: MutPtr<CVoid>, cbprops: Int, flopt: UInt): Int =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPifMgrGetProperties(hprops.rawAddress.toString(), pszgroup.rawAddress.toString(), lpprops.rawAddress.toString(), cbprops, flopt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrOpenProperties(pszapp: Pcwstr, pszpif: Pcwstr, hinf: UInt, flopt: UInt): Handle =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) MutPtr((windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPifMgrOpenProperties(pszapp.rawAddress.toString(), pszpif.rawAddress.toString(), hinf.toInt(), flopt.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrSetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: ConstPtr<CVoid>, cbprops: Int, flopt: UInt): Int =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemPifMgrSetProperties(hprops.rawAddress.toString(), pszgroup.rawAddress.toString(), lpprops.rawAddress.toString(), cbprops, flopt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAddDefaultPropertiesByExt(pszext: Pcwstr, ppropstore: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemSHAddDefaultPropertiesByExt(pszext.rawAddress.toString(), ppropstore.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPropertyStoreForWindow(hwnd: Hwnd, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreForWindow(hwnd.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPropertyStoreFromIDList(pidl: ConstPtr<Itemidlist>, flags: Getpropertystoreflags, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromIDList(pidl.rawAddress.toString(), flags, riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPropertyStoreFromParsingName(pszpath: Pcwstr, pbc: MutPtr<CVoid>, flags: Getpropertystoreflags, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromParsingName(pszpath.rawAddress.toString(), pbc.rawAddress.toString(), flags, riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPropStgCreate(psstg: MutPtr<CVoid>, fmtid: ConstPtr<Guid>, pclsid: ConstPtr<Guid>, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: MutPtr<MutPtr<CVoid>>, pucodepage: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemSHPropStgCreate(psstg.rawAddress.toString(), fmtid.rawAddress.toString(), pclsid.rawAddress.toString(), grfflags.toInt(), grfmode.toInt(), dwdisposition.toInt(), ppstg.rawAddress.toString(), pucodepage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPropStgReadMultiple(pps: MutPtr<CVoid>, ucodepage: UInt, cpspec: UInt, rgpspec: ConstPtr<Propspec>, rgvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemSHPropStgReadMultiple(pps.rawAddress.toString(), ucodepage.toInt(), cpspec.toInt(), rgpspec.rawAddress.toString(), rgvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPropStgWriteMultiple(pps: MutPtr<CVoid>, pucodepage: MutPtr<UInt>, cpspec: UInt, rgpspec: ConstPtr<Propspec>, rgvar: MutPtr<Propvariant>, propidnamefirst: UInt): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAddon != null) (windowsWin32UiShellPropertiessystemNapiAddon.windowssysWindowsWin32UiShellPropertiessystemSHPropStgWriteMultiple(pps.rawAddress.toString(), pucodepage.rawAddress.toString(), cpspec.toInt(), rgpspec.rawAddress.toString(), rgvar.rawAddress.toString(), propidnamefirst.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
