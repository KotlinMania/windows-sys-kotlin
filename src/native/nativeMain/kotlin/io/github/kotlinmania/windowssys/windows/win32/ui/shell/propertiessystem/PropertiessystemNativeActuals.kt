@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun PSCoerceToCanonicalValue(key: Long, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSCoerceToCanonicalValue(key.toCPointer<ByteVar>(), ppropvar.toCPointer<ByteVar>())

public actual fun PSCreateAdapterFromPropertyStore(pps: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateAdapterFromPropertyStore(pps.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSCreateDelayedMultiplexPropertyStore(flags: GETPROPERTYSTOREFLAGS, pdpsf: Long, rgstoreids: Long, cstores: UInt, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateDelayedMultiplexPropertyStore(flags, pdpsf.toCPointer<ByteVar>(), rgstoreids.toCPointer<ByteVar>(), cstores, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSCreateMemoryPropertyStore(riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateMemoryPropertyStore(riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSCreateMultiplexPropertyStore(prgpunkstores: Long, cstores: UInt, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateMultiplexPropertyStore(prgpunkstores.toCPointer<ByteVar>(), cstores, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSCreatePropertyChangeArray(rgpropkey: Long, rgflags: Long, rgpropvar: Long, cchanges: UInt, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyChangeArray(rgpropkey.toCPointer<ByteVar>(), rgflags.toCPointer<ByteVar>(), rgpropvar.toCPointer<ByteVar>(), cchanges, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSCreatePropertyStoreFromObject(punk: Long, grfmode: UInt, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyStoreFromObject(punk.toCPointer<ByteVar>(), grfmode, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSCreatePropertyStoreFromPropertySetStorage(ppss: Long, grfmode: UInt, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyStoreFromPropertySetStorage(ppss.toCPointer<ByteVar>(), grfmode, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSCreateSimplePropertyChange(flags: PKA_FLAGS, key: Long, propvar: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateSimplePropertyChange(flags, key.toCPointer<ByteVar>(), propvar.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSEnumeratePropertyDescriptions(filteron: PROPDESC_ENUMFILTER, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSEnumeratePropertyDescriptions(filteron, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSFormatForDisplay(propkey: Long, propvar: Long, pdfflags: PROPDESC_FORMAT_FLAGS, pwsztext: PWSTR, cchtext: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSFormatForDisplay(propkey.toCPointer<ByteVar>(), propvar.toCPointer<ByteVar>(), pdfflags, pwsztext.toCPointer<ByteVar>(), cchtext)

public actual fun PSFormatForDisplayAlloc(key: Long, propvar: Long, pdff: PROPDESC_FORMAT_FLAGS, ppszdisplay: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSFormatForDisplayAlloc(key.toCPointer<ByteVar>(), propvar.toCPointer<ByteVar>(), pdff, ppszdisplay.toCPointer<ByteVar>())

public actual fun PSFormatPropertyValue(pps: Long, ppd: Long, pdff: PROPDESC_FORMAT_FLAGS, ppszdisplay: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSFormatPropertyValue(pps.toCPointer<ByteVar>(), ppd.toCPointer<ByteVar>(), pdff, ppszdisplay.toCPointer<ByteVar>())

public actual fun PSGetImageReferenceForValue(propkey: Long, propvar: Long, ppszimageres: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSGetImageReferenceForValue(propkey.toCPointer<ByteVar>(), propvar.toCPointer<ByteVar>(), ppszimageres.toCPointer<ByteVar>())

public actual fun PSGetItemPropertyHandler(punkitem: Long, freadwrite: BOOL, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSGetItemPropertyHandler(punkitem.toCPointer<ByteVar>(), freadwrite, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSGetItemPropertyHandlerWithCreateObject(punkitem: Long, freadwrite: BOOL, punkcreateobject: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSGetItemPropertyHandlerWithCreateObject(punkitem.toCPointer<ByteVar>(), freadwrite, punkcreateobject.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSGetNameFromPropertyKey(propkey: Long, ppszcanonicalname: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSGetNameFromPropertyKey(propkey.toCPointer<ByteVar>(), ppszcanonicalname.toCPointer<ByteVar>())

public actual fun PSGetNamedPropertyFromPropertyStorage(psps: PCUSERIALIZEDPROPSTORAGE, cb: UInt, pszname: PCWSTR, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSGetNamedPropertyFromPropertyStorage(psps, cb, pszname.toCPointer<ByteVar>(), ppropvar.toCPointer<ByteVar>())

public actual fun PSGetPropertyDescription(propkey: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescription(propkey.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSGetPropertyDescriptionByName(pszcanonicalname: PCWSTR, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescriptionByName(pszcanonicalname.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSGetPropertyDescriptionListFromString(pszproplist: PCWSTR, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescriptionListFromString(pszproplist.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSGetPropertyFromPropertyStorage(psps: PCUSERIALIZEDPROPSTORAGE, cb: UInt, rpkey: Long, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyFromPropertyStorage(psps, cb, rpkey.toCPointer<ByteVar>(), ppropvar.toCPointer<ByteVar>())

public actual fun PSGetPropertyKeyFromName(pszname: PCWSTR, ppropkey: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyKeyFromName(pszname.toCPointer<ByteVar>(), ppropkey.toCPointer<ByteVar>())

public actual fun PSGetPropertySystem(riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertySystem(riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSGetPropertyValue(pps: Long, ppd: Long, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyValue(pps.toCPointer<ByteVar>(), ppd.toCPointer<ByteVar>(), ppropvar.toCPointer<ByteVar>())

public actual fun PSLookupPropertyHandlerCLSID(pszfilepath: PCWSTR, pclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSLookupPropertyHandlerCLSID(pszfilepath.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>())

public actual fun PSPropertyBag_Delete(propbag: Long, propname: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_Delete(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadBOOL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadBOOL(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadBSTR(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadBSTR(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadDWORD(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadDWORD(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadGUID(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadGUID(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadInt(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadInt(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadLONG(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadLONG(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadPOINTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPOINTL(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadPOINTS(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPOINTS(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadPropertyKey(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPropertyKey(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadRECTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadRECTL(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadSHORT(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadSHORT(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadStr(propbag: Long, propname: PCWSTR, value: PWSTR, charactercount: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStr(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), charactercount)

public actual fun PSPropertyBag_ReadStrAlloc(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStrAlloc(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadStream(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStream(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadType(propbag: Long, propname: PCWSTR, variable: Long, type: VARENUM): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadType(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), variable.toCPointer<ByteVar>(), type)

public actual fun PSPropertyBag_ReadULONGLONG(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadULONGLONG(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_ReadUnknown(propbag: Long, propname: PCWSTR, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadUnknown(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun PSPropertyBag_WriteBOOL(propbag: Long, propname: PCWSTR, value: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteBOOL(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value)

public actual fun PSPropertyBag_WriteBSTR(propbag: Long, propname: PCWSTR, value: BSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteBSTR(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_WriteDWORD(propbag: Long, propname: PCWSTR, value: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteDWORD(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value)

public actual fun PSPropertyBag_WriteGUID(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteGUID(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_WriteInt(propbag: Long, propname: PCWSTR, value: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteInt(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value)

public actual fun PSPropertyBag_WriteLONG(propbag: Long, propname: PCWSTR, value: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteLONG(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value)

public actual fun PSPropertyBag_WritePOINTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePOINTL(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_WritePOINTS(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePOINTS(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_WritePropertyKey(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePropertyKey(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_WriteRECTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteRECTL(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_WriteSHORT(propbag: Long, propname: PCWSTR, value: Short): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteSHORT(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value)

public actual fun PSPropertyBag_WriteStr(propbag: Long, propname: PCWSTR, value: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteStr(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_WriteStream(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteStream(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun PSPropertyBag_WriteULONGLONG(propbag: Long, propname: PCWSTR, value: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteULONGLONG(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value)

public actual fun PSPropertyBag_WriteUnknown(propbag: Long, propname: PCWSTR, punk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteUnknown(propbag.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), punk.toCPointer<ByteVar>())

public actual fun PSPropertyKeyFromString(pszstring: PCWSTR, pkey: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyKeyFromString(pszstring.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>())

public actual fun PSRefreshPropertySchema(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSRefreshPropertySchema()

public actual fun PSRegisterPropertySchema(pszpath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSRegisterPropertySchema(pszpath.toCPointer<ByteVar>())

public actual fun PSSetPropertyValue(pps: Long, ppd: Long, propvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSSetPropertyValue(pps.toCPointer<ByteVar>(), ppd.toCPointer<ByteVar>(), propvar.toCPointer<ByteVar>())

public actual fun PSStringFromPropertyKey(pkey: Long, psz: PWSTR, cch: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSStringFromPropertyKey(pkey.toCPointer<ByteVar>(), psz.toCPointer<ByteVar>(), cch)

public actual fun PSUnregisterPropertySchema(pszpath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PSUnregisterPropertySchema(pszpath.toCPointer<ByteVar>())

public actual fun PifMgr_CloseProperties(hprops: HANDLE, flopt: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_CloseProperties(hprops.toCPointer<ByteVar>(), flopt)?.toLong() ?: 0L

public actual fun PifMgr_GetProperties(hprops: HANDLE, pszgroup: PCSTR, lpprops: Long, cbprops: Int, flopt: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_GetProperties(hprops.toCPointer<ByteVar>(), pszgroup.toCPointer<ByteVar>(), lpprops.toCPointer<ByteVar>(), cbprops, flopt)

public actual fun PifMgr_OpenProperties(pszapp: PCWSTR, pszpif: PCWSTR, hinf: UInt, flopt: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_OpenProperties(pszapp.toCPointer<ByteVar>(), pszpif.toCPointer<ByteVar>(), hinf, flopt)?.toLong() ?: 0L

public actual fun PifMgr_SetProperties(hprops: HANDLE, pszgroup: PCSTR, lpprops: Long, cbprops: Int, flopt: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_SetProperties(hprops.toCPointer<ByteVar>(), pszgroup.toCPointer<ByteVar>(), lpprops.toCPointer<ByteVar>(), cbprops, flopt)

public actual fun SHAddDefaultPropertiesByExt(pszext: PCWSTR, ppropstore: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_SHAddDefaultPropertiesByExt(pszext.toCPointer<ByteVar>(), ppropstore.toCPointer<ByteVar>())

public actual fun SHGetPropertyStoreForWindow(hwnd: HWND, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreForWindow(hwnd.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHGetPropertyStoreFromIDList(pidl: Long, flags: GETPROPERTYSTOREFLAGS, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreFromIDList(pidl.toCPointer<ByteVar>(), flags, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHGetPropertyStoreFromParsingName(pszpath: PCWSTR, pbc: Long, flags: GETPROPERTYSTOREFLAGS, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreFromParsingName(pszpath.toCPointer<ByteVar>(), pbc.toCPointer<ByteVar>(), flags, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHPropStgCreate(psstg: Long, fmtid: Long, pclsid: Long, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: Long, pucodepage: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgCreate(psstg.toCPointer<ByteVar>(), fmtid.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>(), grfflags, grfmode, dwdisposition, ppstg.toCPointer<ByteVar>(), pucodepage.toCPointer<ByteVar>())

public actual fun SHPropStgReadMultiple(pps: Long, ucodepage: UInt, cpspec: UInt, rgpspec: Long, rgvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgReadMultiple(pps.toCPointer<ByteVar>(), ucodepage, cpspec, rgpspec.toCPointer<ByteVar>(), rgvar.toCPointer<ByteVar>())

public actual fun SHPropStgWriteMultiple(pps: Long, pucodepage: Long, cpspec: UInt, rgpspec: Long, rgvar: Long, propidnamefirst: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgWriteMultiple(pps.toCPointer<ByteVar>(), pucodepage.toCPointer<ByteVar>(), cpspec, rgpspec.toCPointer<ByteVar>(), rgvar.toCPointer<ByteVar>(), propidnamefirst)
