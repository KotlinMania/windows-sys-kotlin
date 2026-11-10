@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun pSCoerceToCanonicalValue(key: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSCoerceToCanonicalValue(key?.value?.toCPointer<ByteVar>(), ppropvar?.value?.toCPointer<ByteVar>())

public actual fun pSCreateAdapterFromPropertyStore(pps: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateAdapterFromPropertyStore(pps?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSCreateDelayedMultiplexPropertyStore(flags: Getpropertystoreflags, pdpsf: COpaquePointer?, rgstoreids: COpaquePointer?, cstores: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateDelayedMultiplexPropertyStore(flags, pdpsf?.value?.toCPointer<ByteVar>(), rgstoreids?.value?.toCPointer<ByteVar>(), cstores, riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSCreateMemoryPropertyStore(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateMemoryPropertyStore(riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSCreateMultiplexPropertyStore(prgpunkstores: COpaquePointer?, cstores: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateMultiplexPropertyStore(prgpunkstores?.value?.toCPointer<ByteVar>(), cstores, riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSCreatePropertyChangeArray(rgpropkey: COpaquePointer?, rgflags: COpaquePointer?, rgpropvar: COpaquePointer?, cchanges: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyChangeArray(rgpropkey?.value?.toCPointer<ByteVar>(), rgflags?.value?.toCPointer<ByteVar>(), rgpropvar?.value?.toCPointer<ByteVar>(), cchanges, riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSCreatePropertyStoreFromObject(punk: COpaquePointer?, grfmode: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyStoreFromObject(punk?.value?.toCPointer<ByteVar>(), grfmode, riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSCreatePropertyStoreFromPropertySetStorage(ppss: COpaquePointer?, grfmode: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSCreatePropertyStoreFromPropertySetStorage(ppss?.value?.toCPointer<ByteVar>(), grfmode, riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSCreateSimplePropertyChange(flags: PkaFlags, key: COpaquePointer?, propvar: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSCreateSimplePropertyChange(flags, key?.value?.toCPointer<ByteVar>(), propvar?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSEnumeratePropertyDescriptions(filteron: PropdescEnumfilter, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSEnumeratePropertyDescriptions(filteron, riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSFormatForDisplay(propkey: COpaquePointer?, propvar: COpaquePointer?, pdfflags: PropdescFormatFlags, pwsztext: Pwstr, cchtext: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSFormatForDisplay(propkey?.value?.toCPointer<ByteVar>(), propvar?.value?.toCPointer<ByteVar>(), pdfflags, pwsztext?.value?.toCPointer<ByteVar>(), cchtext)

public actual fun pSFormatForDisplayAlloc(key: COpaquePointer?, propvar: COpaquePointer?, pdff: PropdescFormatFlags, ppszdisplay: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSFormatForDisplayAlloc(key?.value?.toCPointer<ByteVar>(), propvar?.value?.toCPointer<ByteVar>(), pdff, ppszdisplay?.value?.toCPointer<ByteVar>())

public actual fun pSFormatPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, pdff: PropdescFormatFlags, ppszdisplay: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSFormatPropertyValue(pps?.value?.toCPointer<ByteVar>(), ppd?.value?.toCPointer<ByteVar>(), pdff, ppszdisplay?.value?.toCPointer<ByteVar>())

public actual fun pSGetImageReferenceForValue(propkey: COpaquePointer?, propvar: COpaquePointer?, ppszimageres: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSGetImageReferenceForValue(propkey?.value?.toCPointer<ByteVar>(), propvar?.value?.toCPointer<ByteVar>(), ppszimageres?.value?.toCPointer<ByteVar>())

public actual fun pSGetItemPropertyHandler(punkitem: COpaquePointer?, freadwrite: Bool, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSGetItemPropertyHandler(punkitem?.value?.toCPointer<ByteVar>(), freadwrite, riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSGetItemPropertyHandlerWithCreateObject(punkitem: COpaquePointer?, freadwrite: Bool, punkcreateobject: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSGetItemPropertyHandlerWithCreateObject(punkitem?.value?.toCPointer<ByteVar>(), freadwrite, punkcreateobject?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSGetNameFromPropertyKey(propkey: COpaquePointer?, ppszcanonicalname: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSGetNameFromPropertyKey(propkey?.value?.toCPointer<ByteVar>(), ppszcanonicalname?.value?.toCPointer<ByteVar>())

public actual fun pSGetNamedPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, pszname: Pcwstr, ppropvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSGetNamedPropertyFromPropertyStorage(psps.toLong(), cb, pszname?.value?.toCPointer<ByteVar>(), ppropvar?.value?.toCPointer<ByteVar>())

public actual fun pSGetPropertyDescription(propkey: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescription(propkey?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSGetPropertyDescriptionByName(pszcanonicalname: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescriptionByName(pszcanonicalname?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSGetPropertyDescriptionListFromString(pszproplist: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyDescriptionListFromString(pszproplist?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSGetPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, rpkey: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyFromPropertyStorage(psps.toLong(), cb, rpkey?.value?.toCPointer<ByteVar>(), ppropvar?.value?.toCPointer<ByteVar>())

public actual fun pSGetPropertyKeyFromName(pszname: Pcwstr, ppropkey: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyKeyFromName(pszname?.value?.toCPointer<ByteVar>(), ppropkey?.value?.toCPointer<ByteVar>())

public actual fun pSGetPropertySystem(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertySystem(riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pSGetPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSGetPropertyValue(pps?.value?.toCPointer<ByteVar>(), ppd?.value?.toCPointer<ByteVar>(), ppropvar?.value?.toCPointer<ByteVar>())

public actual fun pSLookupPropertyHandlerCLSID(pszfilepath: Pcwstr, pclsid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSLookupPropertyHandlerCLSID(pszfilepath?.value?.toCPointer<ByteVar>(), pclsid?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagDelete(propbag: COpaquePointer?, propname: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagDelete(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadBool(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadBool(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadBstr(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadBstr(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadDword(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadDword(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadGuid(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadGuid(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadInt(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadInt(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadLong(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadLong(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadPointl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPointl(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadPoints(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPoints(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadPropertyKey(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadPropertyKey(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadRectl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadRectl(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadShort(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadShort(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadStr(propbag: COpaquePointer?, propname: Pcwstr, value: Pwstr, charactercount: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStr(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), charactercount)

public actual fun pspropertyBagReadStrAlloc(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStrAlloc(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadStream(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadStream(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadType(propbag: COpaquePointer?, propname: Pcwstr, variable: COpaquePointer?, type: Varenum): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadType(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), variable?.value?.toCPointer<ByteVar>(), type)

public actual fun pspropertyBagReadUlonglong(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadUlonglong(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagReadUnknown(propbag: COpaquePointer?, propname: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagReadUnknown(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagWriteBool(propbag: COpaquePointer?, propname: Pcwstr, value: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteBool(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value)

public actual fun pspropertyBagWriteBstr(propbag: COpaquePointer?, propname: Pcwstr, value: Bstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteBstr(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagWriteDword(propbag: COpaquePointer?, propname: Pcwstr, value: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteDword(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value)

public actual fun pspropertyBagWriteGuid(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteGuid(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagWriteInt(propbag: COpaquePointer?, propname: Pcwstr, value: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteInt(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value)

public actual fun pspropertyBagWriteLong(propbag: COpaquePointer?, propname: Pcwstr, value: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteLong(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value)

public actual fun pspropertyBagWritePointl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePointl(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagWritePoints(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePoints(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagWritePropertyKey(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWritePropertyKey(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagWriteRectl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteRectl(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagWriteShort(propbag: COpaquePointer?, propname: Pcwstr, value: Short): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteShort(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value)

public actual fun pspropertyBagWriteStr(propbag: COpaquePointer?, propname: Pcwstr, value: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteStr(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagWriteStream(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteStream(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pspropertyBagWriteUlonglong(propbag: COpaquePointer?, propname: Pcwstr, value: ULong): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteUlonglong(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value)

public actual fun pspropertyBagWriteUnknown(propbag: COpaquePointer?, propname: Pcwstr, punk: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pspropertyBagWriteUnknown(propbag?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), punk?.value?.toCPointer<ByteVar>())

public actual fun pSPropertyKeyFromString(pszstring: Pcwstr, pkey: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSPropertyKeyFromString(pszstring?.value?.toCPointer<ByteVar>(), pkey?.value?.toCPointer<ByteVar>())

public actual fun pSRefreshPropertySchema(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSRefreshPropertySchema()

public actual fun pSRegisterPropertySchema(pszpath: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSRegisterPropertySchema(pszpath?.value?.toCPointer<ByteVar>())

public actual fun pSSetPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, propvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSSetPropertyValue(pps?.value?.toCPointer<ByteVar>(), ppd?.value?.toCPointer<ByteVar>(), propvar?.value?.toCPointer<ByteVar>())

public actual fun pSStringFromPropertyKey(pkey: COpaquePointer?, psz: Pwstr, cch: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSStringFromPropertyKey(pkey?.value?.toCPointer<ByteVar>(), psz?.value?.toCPointer<ByteVar>(), cch)

public actual fun pSUnregisterPropertySchema(pszpath: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pSUnregisterPropertySchema(pszpath?.value?.toCPointer<ByteVar>())

public actual fun pifMgrCloseProperties(hprops: Handle, flopt: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pifMgrCloseProperties(hprops?.value?.toCPointer<ByteVar>(), flopt)?.let { COpaquePointer(it.toLong()) }

public actual fun pifMgrGetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: COpaquePointer?, cbprops: Int, flopt: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pifMgrGetProperties(hprops?.value?.toCPointer<ByteVar>(), pszgroup?.value?.toCPointer<ByteVar>(), lpprops?.value?.toCPointer<ByteVar>(), cbprops, flopt)

public actual fun pifMgrOpenProperties(pszapp: Pcwstr, pszpif: Pcwstr, hinf: UInt, flopt: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pifMgrOpenProperties(pszapp?.value?.toCPointer<ByteVar>(), pszpif?.value?.toCPointer<ByteVar>(), hinf, flopt)?.let { COpaquePointer(it.toLong()) }

public actual fun pifMgrSetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: COpaquePointer?, cbprops: Int, flopt: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_pifMgrSetProperties(hprops?.value?.toCPointer<ByteVar>(), pszgroup?.value?.toCPointer<ByteVar>(), lpprops?.value?.toCPointer<ByteVar>(), cbprops, flopt)

public actual fun sHAddDefaultPropertiesByExt(pszext: Pcwstr, ppropstore: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_sHAddDefaultPropertiesByExt(pszext?.value?.toCPointer<ByteVar>(), ppropstore?.value?.toCPointer<ByteVar>())

public actual fun sHGetPropertyStoreForWindow(hwnd: Hwnd, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreForWindow(hwnd?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun sHGetPropertyStoreFromIDList(pidl: COpaquePointer?, flags: Getpropertystoreflags, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreFromIDList(pidl?.value?.toCPointer<ByteVar>(), flags, riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun sHGetPropertyStoreFromParsingName(pszpath: Pcwstr, pbc: COpaquePointer?, flags: Getpropertystoreflags, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_sHGetPropertyStoreFromParsingName(pszpath?.value?.toCPointer<ByteVar>(), pbc?.value?.toCPointer<ByteVar>(), flags, riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun sHPropStgCreate(psstg: COpaquePointer?, fmtid: COpaquePointer?, pclsid: COpaquePointer?, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: COpaquePointer?, pucodepage: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgCreate(psstg?.value?.toCPointer<ByteVar>(), fmtid?.value?.toCPointer<ByteVar>(), pclsid?.value?.toCPointer<ByteVar>(), grfflags, grfmode, dwdisposition, ppstg?.value?.toCPointer<ByteVar>(), pucodepage?.value?.toCPointer<ByteVar>())

public actual fun sHPropStgReadMultiple(pps: COpaquePointer?, ucodepage: UInt, cpspec: UInt, rgpspec: COpaquePointer?, rgvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgReadMultiple(pps?.value?.toCPointer<ByteVar>(), ucodepage, cpspec, rgpspec?.value?.toCPointer<ByteVar>(), rgvar?.value?.toCPointer<ByteVar>())

public actual fun sHPropStgWriteMultiple(pps: COpaquePointer?, pucodepage: COpaquePointer?, cpspec: UInt, rgpspec: COpaquePointer?, rgvar: COpaquePointer?, propidnamefirst: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssys_windows_win32_ui_shell_propertiessystem_sHPropStgWriteMultiple(pps?.value?.toCPointer<ByteVar>(), pucodepage?.value?.toCPointer<ByteVar>(), cpspec, rgpspec?.value?.toCPointer<ByteVar>(), rgvar?.value?.toCPointer<ByteVar>(), propidnamefirst)
