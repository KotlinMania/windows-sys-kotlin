@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARENUM

private val _windowsWin32UiShellPropertiessystemNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun PSCoerceToCanonicalValue(key: Long, ppropvar: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSCoerceToCanonicalValue(key.toString(), ppropvar.toString()) as Int) else 0

public actual fun PSCreateAdapterFromPropertyStore(pps: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateAdapterFromPropertyStore(pps.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSCreateDelayedMultiplexPropertyStore(flags: GETPROPERTYSTOREFLAGS, pdpsf: Long, rgstoreids: Long, cstores: UInt, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateDelayedMultiplexPropertyStore(flags, pdpsf.toString(), rgstoreids.toString(), cstores.toInt(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSCreateMemoryPropertyStore(riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateMemoryPropertyStore(riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSCreateMultiplexPropertyStore(prgpunkstores: Long, cstores: UInt, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateMultiplexPropertyStore(prgpunkstores.toString(), cstores.toInt(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSCreatePropertyChangeArray(rgpropkey: Long, rgflags: Long, rgpropvar: Long, cchanges: UInt, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyChangeArray(rgpropkey.toString(), rgflags.toString(), rgpropvar.toString(), cchanges.toInt(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSCreatePropertyStoreFromObject(punk: Long, grfmode: UInt, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyStoreFromObject(punk.toString(), grfmode.toInt(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSCreatePropertyStoreFromPropertySetStorage(ppss: Long, grfmode: UInt, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyStoreFromPropertySetStorage(ppss.toString(), grfmode.toInt(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSCreateSimplePropertyChange(flags: PKA_FLAGS, key: Long, propvar: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateSimplePropertyChange(flags, key.toString(), propvar.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSEnumeratePropertyDescriptions(filteron: PROPDESC_ENUMFILTER, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSEnumeratePropertyDescriptions(filteron, riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSFormatForDisplay(propkey: Long, propvar: Long, pdfflags: PROPDESC_FORMAT_FLAGS, pwsztext: PWSTR, cchtext: UInt): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSFormatForDisplay(propkey.toString(), propvar.toString(), pdfflags, pwsztext.toString(), cchtext.toInt()) as Int) else 0

public actual fun PSFormatForDisplayAlloc(key: Long, propvar: Long, pdff: PROPDESC_FORMAT_FLAGS, ppszdisplay: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSFormatForDisplayAlloc(key.toString(), propvar.toString(), pdff, ppszdisplay.toString()) as Int) else 0

public actual fun PSFormatPropertyValue(pps: Long, ppd: Long, pdff: PROPDESC_FORMAT_FLAGS, ppszdisplay: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSFormatPropertyValue(pps.toString(), ppd.toString(), pdff, ppszdisplay.toString()) as Int) else 0

public actual fun PSGetImageReferenceForValue(propkey: Long, propvar: Long, ppszimageres: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSGetImageReferenceForValue(propkey.toString(), propvar.toString(), ppszimageres.toString()) as Int) else 0

public actual fun PSGetItemPropertyHandler(punkitem: Long, freadwrite: BOOL, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSGetItemPropertyHandler(punkitem.toString(), freadwrite, riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSGetItemPropertyHandlerWithCreateObject(punkitem: Long, freadwrite: BOOL, punkcreateobject: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSGetItemPropertyHandlerWithCreateObject(punkitem.toString(), freadwrite, punkcreateobject.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSGetNameFromPropertyKey(propkey: Long, ppszcanonicalname: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSGetNameFromPropertyKey(propkey.toString(), ppszcanonicalname.toString()) as Int) else 0

public actual fun PSGetNamedPropertyFromPropertyStorage(psps: PCUSERIALIZEDPROPSTORAGE, cb: UInt, pszname: PCWSTR, ppropvar: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSGetNamedPropertyFromPropertyStorage(psps.toString(), cb.toInt(), pszname.toString(), ppropvar.toString()) as Int) else 0

public actual fun PSGetPropertyDescription(propkey: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescription(propkey.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSGetPropertyDescriptionByName(pszcanonicalname: PCWSTR, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescriptionByName(pszcanonicalname.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSGetPropertyDescriptionListFromString(pszproplist: PCWSTR, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescriptionListFromString(pszproplist.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSGetPropertyFromPropertyStorage(psps: PCUSERIALIZEDPROPSTORAGE, cb: UInt, rpkey: Long, ppropvar: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyFromPropertyStorage(psps.toString(), cb.toInt(), rpkey.toString(), ppropvar.toString()) as Int) else 0

public actual fun PSGetPropertyKeyFromName(pszname: PCWSTR, ppropkey: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyKeyFromName(pszname.toString(), ppropkey.toString()) as Int) else 0

public actual fun PSGetPropertySystem(riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertySystem(riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSGetPropertyValue(pps: Long, ppd: Long, ppropvar: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyValue(pps.toString(), ppd.toString(), ppropvar.toString()) as Int) else 0

public actual fun PSLookupPropertyHandlerCLSID(pszfilepath: PCWSTR, pclsid: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSLookupPropertyHandlerCLSID(pszfilepath.toString(), pclsid.toString()) as Int) else 0

public actual fun PSPropertyBag_Delete(propbag: Long, propname: PCWSTR): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_Delete(propbag.toString(), propname.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadBOOL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadBOOL(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadBSTR(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadBSTR(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadDWORD(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadDWORD(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadGUID(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadGUID(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadInt(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadInt(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadLONG(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadLONG(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadPOINTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPOINTL(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadPOINTS(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPOINTS(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadPropertyKey(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPropertyKey(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadRECTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadRECTL(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadSHORT(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadSHORT(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadStr(propbag: Long, propname: PCWSTR, value: PWSTR, charactercount: Int): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStr(propbag.toString(), propname.toString(), value.toString(), charactercount) as Int) else 0

public actual fun PSPropertyBag_ReadStrAlloc(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStrAlloc(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadStream(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStream(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadType(propbag: Long, propname: PCWSTR, variable: Long, type: VARENUM): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadType(propbag.toString(), propname.toString(), variable.toString(), type.toInt()) as Int) else 0

public actual fun PSPropertyBag_ReadULONGLONG(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadULONGLONG(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_ReadUnknown(propbag: Long, propname: PCWSTR, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadUnknown(propbag.toString(), propname.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun PSPropertyBag_WriteBOOL(propbag: Long, propname: PCWSTR, value: BOOL): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteBOOL(propbag.toString(), propname.toString(), value) as Int) else 0

public actual fun PSPropertyBag_WriteBSTR(propbag: Long, propname: PCWSTR, value: BSTR): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteBSTR(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_WriteDWORD(propbag: Long, propname: PCWSTR, value: UInt): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteDWORD(propbag.toString(), propname.toString(), value.toInt()) as Int) else 0

public actual fun PSPropertyBag_WriteGUID(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteGUID(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_WriteInt(propbag: Long, propname: PCWSTR, value: Int): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteInt(propbag.toString(), propname.toString(), value) as Int) else 0

public actual fun PSPropertyBag_WriteLONG(propbag: Long, propname: PCWSTR, value: Int): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteLONG(propbag.toString(), propname.toString(), value) as Int) else 0

public actual fun PSPropertyBag_WritePOINTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePOINTL(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_WritePOINTS(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePOINTS(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_WritePropertyKey(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePropertyKey(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_WriteRECTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteRECTL(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_WriteSHORT(propbag: Long, propname: PCWSTR, value: Short): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteSHORT(propbag.toString(), propname.toString(), value.toInt()) as Int) else 0

public actual fun PSPropertyBag_WriteStr(propbag: Long, propname: PCWSTR, value: PCWSTR): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteStr(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_WriteStream(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteStream(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_WriteULONGLONG(propbag: Long, propname: PCWSTR, value: ULong): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteULONGLONG(propbag.toString(), propname.toString(), value.toString()) as Int) else 0

public actual fun PSPropertyBag_WriteUnknown(propbag: Long, propname: PCWSTR, punk: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteUnknown(propbag.toString(), propname.toString(), punk.toString()) as Int) else 0

public actual fun PSPropertyKeyFromString(pszstring: PCWSTR, pkey: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyKeyFromString(pszstring.toString(), pkey.toString()) as Int) else 0

public actual fun PSRefreshPropertySchema(): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSRefreshPropertySchema() as Int) else 0

public actual fun PSRegisterPropertySchema(pszpath: PCWSTR): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSRegisterPropertySchema(pszpath.toString()) as Int) else 0

public actual fun PSSetPropertyValue(pps: Long, ppd: Long, propvar: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSSetPropertyValue(pps.toString(), ppd.toString(), propvar.toString()) as Int) else 0

public actual fun PSStringFromPropertyKey(pkey: Long, psz: PWSTR, cch: UInt): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSStringFromPropertyKey(pkey.toString(), psz.toString(), cch.toInt()) as Int) else 0

public actual fun PSUnregisterPropertySchema(pszpath: PCWSTR): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PSUnregisterPropertySchema(pszpath.toString()) as Int) else 0

public actual fun PifMgr_CloseProperties(hprops: HANDLE, flopt: UInt): HANDLE =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_CloseProperties(hprops.toString(), flopt.toInt()) as String).toLong() else 0L

public actual fun PifMgr_GetProperties(hprops: HANDLE, pszgroup: PCSTR, lpprops: Long, cbprops: Int, flopt: UInt): Int =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_GetProperties(hprops.toString(), pszgroup.toString(), lpprops.toString(), cbprops, flopt.toInt()) as Int) else 0

public actual fun PifMgr_OpenProperties(pszapp: PCWSTR, pszpif: PCWSTR, hinf: UInt, flopt: UInt): HANDLE =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_OpenProperties(pszapp.toString(), pszpif.toString(), hinf.toInt(), flopt.toInt()) as String).toLong() else 0L

public actual fun PifMgr_SetProperties(hprops: HANDLE, pszgroup: PCSTR, lpprops: Long, cbprops: Int, flopt: UInt): Int =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_SetProperties(hprops.toString(), pszgroup.toString(), lpprops.toString(), cbprops, flopt.toInt()) as Int) else 0

public actual fun SHAddDefaultPropertiesByExt(pszext: PCWSTR, ppropstore: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_SHAddDefaultPropertiesByExt(pszext.toString(), ppropstore.toString()) as Int) else 0

public actual fun SHGetPropertyStoreForWindow(hwnd: HWND, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreForWindow(hwnd.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHGetPropertyStoreFromIDList(pidl: Long, flags: GETPROPERTYSTOREFLAGS, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreFromIDList(pidl.toString(), flags, riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHGetPropertyStoreFromParsingName(pszpath: PCWSTR, pbc: Long, flags: GETPROPERTYSTOREFLAGS, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreFromParsingName(pszpath.toString(), pbc.toString(), flags, riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHPropStgCreate(psstg: Long, fmtid: Long, pclsid: Long, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: Long, pucodepage: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgCreate(psstg.toString(), fmtid.toString(), pclsid.toString(), grfflags.toInt(), grfmode.toInt(), dwdisposition.toInt(), ppstg.toString(), pucodepage.toString()) as Int) else 0

public actual fun SHPropStgReadMultiple(pps: Long, ucodepage: UInt, cpspec: UInt, rgpspec: Long, rgvar: Long): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgReadMultiple(pps.toString(), ucodepage.toInt(), cpspec.toInt(), rgpspec.toString(), rgvar.toString()) as Int) else 0

public actual fun SHPropStgWriteMultiple(pps: Long, pucodepage: Long, cpspec: UInt, rgpspec: Long, rgvar: Long, propidnamefirst: UInt): HRESULT =
    if (_windowsWin32UiShellPropertiessystemNapiAddon != null) (_windowsWin32UiShellPropertiessystemNapiAddon.windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgWriteMultiple(pps.toString(), pucodepage.toString(), cpspec.toInt(), rgpspec.toString(), rgvar.toString(), propidnamefirst.toInt()) as Int) else 0
