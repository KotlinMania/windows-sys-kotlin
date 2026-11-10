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

private val _windowsWin32UiShellPropertiessystemNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun pSCoerceToCanonicalValue(key: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSCoerceToCanonicalValue((key?.value ?: 0L).toString(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateAdapterFromPropertyStore(pps: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateAdapterFromPropertyStore((pps?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateDelayedMultiplexPropertyStore(flags: Getpropertystoreflags, pdpsf: COpaquePointer?, rgstoreids: COpaquePointer?, cstores: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateDelayedMultiplexPropertyStore(flags, (pdpsf?.value ?: 0L).toString(), (rgstoreids?.value ?: 0L).toString(), cstores.toInt(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateMemoryPropertyStore(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateMemoryPropertyStore((riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateMultiplexPropertyStore(prgpunkstores: COpaquePointer?, cstores: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateMultiplexPropertyStore((prgpunkstores?.value ?: 0L).toString(), cstores.toInt(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreatePropertyChangeArray(rgpropkey: COpaquePointer?, rgflags: COpaquePointer?, rgpropvar: COpaquePointer?, cchanges: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyChangeArray((rgpropkey?.value ?: 0L).toString(), (rgflags?.value ?: 0L).toString(), (rgpropvar?.value ?: 0L).toString(), cchanges.toInt(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreatePropertyStoreFromObject(punk: COpaquePointer?, grfmode: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyStoreFromObject((punk?.value ?: 0L).toString(), grfmode.toInt(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreatePropertyStoreFromPropertySetStorage(ppss: COpaquePointer?, grfmode: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyStoreFromPropertySetStorage((ppss?.value ?: 0L).toString(), grfmode.toInt(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateSimplePropertyChange(flags: PkaFlags, key: COpaquePointer?, propvar: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateSimplePropertyChange(flags, (key?.value ?: 0L).toString(), (propvar?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSEnumeratePropertyDescriptions(filteron: PropdescEnumfilter, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSEnumeratePropertyDescriptions(filteron, (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSFormatForDisplay(propkey: COpaquePointer?, propvar: COpaquePointer?, pdfflags: PropdescFormatFlags, pwsztext: Pwstr, cchtext: UInt): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSFormatForDisplay((propkey?.value ?: 0L).toString(), (propvar?.value ?: 0L).toString(), pdfflags, (pwsztext?.value ?: 0L).toString(), cchtext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSFormatForDisplayAlloc(key: COpaquePointer?, propvar: COpaquePointer?, pdff: PropdescFormatFlags, ppszdisplay: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSFormatForDisplayAlloc((key?.value ?: 0L).toString(), (propvar?.value ?: 0L).toString(), pdff, (ppszdisplay?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSFormatPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, pdff: PropdescFormatFlags, ppszdisplay: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSFormatPropertyValue((pps?.value ?: 0L).toString(), (ppd?.value ?: 0L).toString(), pdff, (ppszdisplay?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetImageReferenceForValue(propkey: COpaquePointer?, propvar: COpaquePointer?, ppszimageres: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSGetImageReferenceForValue((propkey?.value ?: 0L).toString(), (propvar?.value ?: 0L).toString(), (ppszimageres?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetItemPropertyHandler(punkitem: COpaquePointer?, freadwrite: Bool, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSGetItemPropertyHandler((punkitem?.value ?: 0L).toString(), freadwrite, (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetItemPropertyHandlerWithCreateObject(punkitem: COpaquePointer?, freadwrite: Bool, punkcreateobject: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSGetItemPropertyHandlerWithCreateObject((punkitem?.value ?: 0L).toString(), freadwrite, (punkcreateobject?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetNameFromPropertyKey(propkey: COpaquePointer?, ppszcanonicalname: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSGetNameFromPropertyKey((propkey?.value ?: 0L).toString(), (ppszcanonicalname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetNamedPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, pszname: Pcwstr, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSGetNamedPropertyFromPropertyStorage(psps.toString(), cb.toInt(), (pszname?.value ?: 0L).toString(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyDescription(propkey: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescription((propkey?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyDescriptionByName(pszcanonicalname: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescriptionByName((pszcanonicalname?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyDescriptionListFromString(pszproplist: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescriptionListFromString((pszproplist?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, rpkey: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyFromPropertyStorage(psps.toString(), cb.toInt(), (rpkey?.value ?: 0L).toString(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyKeyFromName(pszname: Pcwstr, ppropkey: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyKeyFromName((pszname?.value ?: 0L).toString(), (ppropkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertySystem(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertySystem((riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyValue((pps?.value ?: 0L).toString(), (ppd?.value ?: 0L).toString(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSLookupPropertyHandlerCLSID(pszfilepath: Pcwstr, pclsid: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSLookupPropertyHandlerCLSID((pszfilepath?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagDelete(propbag: COpaquePointer?, propname: Pcwstr): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagDelete((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadBool(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadBool((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadBstr(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadBstr((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadDword(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadDword((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadGuid(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadGuid((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadInt(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadInt((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadLong(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadLong((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadPointl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPointl((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadPoints(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPoints((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadPropertyKey(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPropertyKey((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadRectl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadRectl((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadShort(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadShort((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadStr(propbag: COpaquePointer?, propname: Pcwstr, value: Pwstr, charactercount: Int): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStr((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), charactercount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadStrAlloc(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStrAlloc((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadStream(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStream((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadType(propbag: COpaquePointer?, propname: Pcwstr, variable: COpaquePointer?, type: Varenum): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadType((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (variable?.value ?: 0L).toString(), type.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadUlonglong(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadUlonglong((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadUnknown(propbag: COpaquePointer?, propname: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadUnknown((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteBool(propbag: COpaquePointer?, propname: Pcwstr, value: Bool): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteBool((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteBstr(propbag: COpaquePointer?, propname: Pcwstr, value: Bstr): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteBstr((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteDword(propbag: COpaquePointer?, propname: Pcwstr, value: UInt): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteDword((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteGuid(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteGuid((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteInt(propbag: COpaquePointer?, propname: Pcwstr, value: Int): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteInt((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteLong(propbag: COpaquePointer?, propname: Pcwstr, value: Int): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteLong((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWritePointl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePointl((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWritePoints(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePoints((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWritePropertyKey(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePropertyKey((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteRectl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteRectl((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteShort(propbag: COpaquePointer?, propname: Pcwstr, value: Short): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteShort((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteStr(propbag: COpaquePointer?, propname: Pcwstr, value: Pcwstr): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteStr((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteStream(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteStream((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteUlonglong(propbag: COpaquePointer?, propname: Pcwstr, value: ULong): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteUlonglong((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteUnknown(propbag: COpaquePointer?, propname: Pcwstr, punk: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteUnknown((propbag?.value ?: 0L).toString(), (propname?.value ?: 0L).toString(), (punk?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSPropertyKeyFromString(pszstring: Pcwstr, pkey: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSPropertyKeyFromString((pszstring?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSRefreshPropertySchema(): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSRefreshPropertySchema() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSRegisterPropertySchema(pszpath: Pcwstr): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSRegisterPropertySchema((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSSetPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, propvar: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSSetPropertyValue((pps?.value ?: 0L).toString(), (ppd?.value ?: 0L).toString(), (propvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSStringFromPropertyKey(pkey: COpaquePointer?, psz: Pwstr, cch: UInt): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSStringFromPropertyKey((pkey?.value ?: 0L).toString(), (psz?.value ?: 0L).toString(), cch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSUnregisterPropertySchema(pszpath: Pcwstr): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pSUnregisterPropertySchema((pszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrCloseProperties(hprops: Handle, flopt: UInt): Handle =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pifMgrCloseProperties((hprops?.value ?: 0L).toString(), flopt.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrGetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: COpaquePointer?, cbprops: Int, flopt: UInt): Int =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pifMgrGetProperties((hprops?.value ?: 0L).toString(), (pszgroup?.value ?: 0L).toString(), (lpprops?.value ?: 0L).toString(), cbprops, flopt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrOpenProperties(pszapp: Pcwstr, pszpif: Pcwstr, hinf: UInt, flopt: UInt): Handle =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pifMgrOpenProperties((pszapp?.value ?: 0L).toString(), (pszpif?.value ?: 0L).toString(), hinf.toInt(), flopt.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrSetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: COpaquePointer?, cbprops: Int, flopt: UInt): Int =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_pifMgrSetProperties((hprops?.value ?: 0L).toString(), (pszgroup?.value ?: 0L).toString(), (lpprops?.value ?: 0L).toString(), cbprops, flopt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAddDefaultPropertiesByExt(pszext: Pcwstr, ppropstore: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_sHAddDefaultPropertiesByExt((pszext?.value ?: 0L).toString(), (ppropstore?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPropertyStoreForWindow(hwnd: Hwnd, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreForWindow((hwnd?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPropertyStoreFromIDList(pidl: COpaquePointer?, flags: Getpropertystoreflags, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreFromIDList((pidl?.value ?: 0L).toString(), flags, (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPropertyStoreFromParsingName(pszpath: Pcwstr, pbc: COpaquePointer?, flags: Getpropertystoreflags, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreFromParsingName((pszpath?.value ?: 0L).toString(), (pbc?.value ?: 0L).toString(), flags, (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPropStgCreate(psstg: COpaquePointer?, fmtid: COpaquePointer?, pclsid: COpaquePointer?, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: COpaquePointer?, pucodepage: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgCreate((psstg?.value ?: 0L).toString(), (fmtid?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString(), grfflags.toInt(), grfmode.toInt(), dwdisposition.toInt(), (ppstg?.value ?: 0L).toString(), (pucodepage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPropStgReadMultiple(pps: COpaquePointer?, ucodepage: UInt, cpspec: UInt, rgpspec: COpaquePointer?, rgvar: COpaquePointer?): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgReadMultiple((pps?.value ?: 0L).toString(), ucodepage.toInt(), cpspec.toInt(), (rgpspec?.value ?: 0L).toString(), (rgvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPropStgWriteMultiple(pps: COpaquePointer?, pucodepage: COpaquePointer?, cpspec: UInt, rgpspec: COpaquePointer?, rgvar: COpaquePointer?, propidnamefirst: UInt): Hresult =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgWriteMultiple((pps?.value ?: 0L).toString(), (pucodepage?.value ?: 0L).toString(), cpspec.toInt(), (rgpspec?.value ?: 0L).toString(), (rgvar?.value ?: 0L).toString(), propidnamefirst.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
