@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSCoerceToCanonicalValue
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSCreateAdapterFromPropertyStore
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSCreateDelayedMultiplexPropertyStore
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSCreateMemoryPropertyStore
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSCreateMultiplexPropertyStore
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyChangeArray
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromObject
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromPropertySetStorage
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSCreateSimplePropertyChange
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSEnumeratePropertyDescriptions
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplay
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplayAlloc
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSFormatPropertyValue
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSGetImageReferenceForValue
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandler
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandlerWithCreateObject
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSGetNameFromPropertyKey
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSGetNamedPropertyFromPropertyStorage
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescription
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionByName
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionListFromString
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyFromPropertyStorage
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyKeyFromName
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertySystem
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyValue
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSLookupPropertyHandlerCLSID
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSPropertyKeyFromString
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSRegisterPropertySchema
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSSetPropertyValue
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSStringFromPropertyKey
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPSUnregisterPropertySchema
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPifMgrCloseProperties
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPifMgrGetProperties
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPifMgrOpenProperties
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPifMgrSetProperties
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagDelete
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBool
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBstr
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadDword
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadGuid
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadInt
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadLong
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPointl
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPoints
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPropertyKey
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadRectl
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadShort
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStr
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStrAlloc
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStream
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadType
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUlonglong
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUnknown
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBool
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBstr
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteDword
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteGuid
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteInt
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteLong
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePointl
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePoints
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePropertyKey
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteRectl
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteShort
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStr
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStream
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUlonglong
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUnknown
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemSHAddDefaultPropertiesByExt
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreForWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromIDList
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromParsingName
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemSHPropStgCreate
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemSHPropStgReadMultiple
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem.cinterop.windowssysWindowsWin32UiShellPropertiessystemSHPropStgWriteMultiple
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun pSCoerceToCanonicalValue(key: ConstPtr<Propertykey>, ppropvar: MutPtr<Propvariant>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSCoerceToCanonicalValue(key.rawAddress.toCPointer<ByteVar>(), ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun pSCreateAdapterFromPropertyStore(pps: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSCreateAdapterFromPropertyStore(pps.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSCreateDelayedMultiplexPropertyStore(flags: Getpropertystoreflags, pdpsf: MutPtr<CVoid>, rgstoreids: ConstPtr<UInt>, cstores: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSCreateDelayedMultiplexPropertyStore(flags, pdpsf.rawAddress.toCPointer<ByteVar>(), rgstoreids.rawAddress.toCPointer<ByteVar>(), cstores, riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSCreateMemoryPropertyStore(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSCreateMemoryPropertyStore(riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSCreateMultiplexPropertyStore(prgpunkstores: ConstPtr<MutPtr<CVoid>>, cstores: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSCreateMultiplexPropertyStore(prgpunkstores.rawAddress.toCPointer<ByteVar>(), cstores, riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSCreatePropertyChangeArray(rgpropkey: ConstPtr<Propertykey>, rgflags: ConstPtr<PkaFlags>, rgpropvar: ConstPtr<Propvariant>, cchanges: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyChangeArray(rgpropkey.rawAddress.toCPointer<ByteVar>(), rgflags.rawAddress.toCPointer<ByteVar>(), rgpropvar.rawAddress.toCPointer<ByteVar>(), cchanges, riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSCreatePropertyStoreFromObject(punk: MutPtr<CVoid>, grfmode: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromObject(punk.rawAddress.toCPointer<ByteVar>(), grfmode, riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSCreatePropertyStoreFromPropertySetStorage(ppss: MutPtr<CVoid>, grfmode: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromPropertySetStorage(ppss.rawAddress.toCPointer<ByteVar>(), grfmode, riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSCreateSimplePropertyChange(flags: PkaFlags, key: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSCreateSimplePropertyChange(flags, key.rawAddress.toCPointer<ByteVar>(), propvar.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSEnumeratePropertyDescriptions(filteron: PropdescEnumfilter, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSEnumeratePropertyDescriptions(filteron, riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSFormatForDisplay(propkey: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, pdfflags: PropdescFormatFlags, pwsztext: Pwstr, cchtext: UInt): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplay(propkey.rawAddress.toCPointer<ByteVar>(), propvar.rawAddress.toCPointer<ByteVar>(), pdfflags, pwsztext.rawAddress.toCPointer<ByteVar>(), cchtext)

public actual fun pSFormatForDisplayAlloc(key: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, pdff: PropdescFormatFlags, ppszdisplay: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplayAlloc(key.rawAddress.toCPointer<ByteVar>(), propvar.rawAddress.toCPointer<ByteVar>(), pdff, ppszdisplay.rawAddress.toCPointer<ByteVar>())

public actual fun pSFormatPropertyValue(pps: MutPtr<CVoid>, ppd: MutPtr<CVoid>, pdff: PropdescFormatFlags, ppszdisplay: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSFormatPropertyValue(pps.rawAddress.toCPointer<ByteVar>(), ppd.rawAddress.toCPointer<ByteVar>(), pdff, ppszdisplay.rawAddress.toCPointer<ByteVar>())

public actual fun pSGetImageReferenceForValue(propkey: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, ppszimageres: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSGetImageReferenceForValue(propkey.rawAddress.toCPointer<ByteVar>(), propvar.rawAddress.toCPointer<ByteVar>(), ppszimageres.rawAddress.toCPointer<ByteVar>())

public actual fun pSGetItemPropertyHandler(punkitem: MutPtr<CVoid>, freadwrite: Bool, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandler(punkitem.rawAddress.toCPointer<ByteVar>(), freadwrite, riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSGetItemPropertyHandlerWithCreateObject(punkitem: MutPtr<CVoid>, freadwrite: Bool, punkcreateobject: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandlerWithCreateObject(punkitem.rawAddress.toCPointer<ByteVar>(), freadwrite, punkcreateobject.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSGetNameFromPropertyKey(propkey: ConstPtr<Propertykey>, ppszcanonicalname: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSGetNameFromPropertyKey(propkey.rawAddress.toCPointer<ByteVar>(), ppszcanonicalname.rawAddress.toCPointer<ByteVar>())

public actual fun pSGetNamedPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, pszname: Pcwstr, ppropvar: MutPtr<Propvariant>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSGetNamedPropertyFromPropertyStorage(psps, cb, pszname.rawAddress.toCPointer<ByteVar>(), ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun pSGetPropertyDescription(propkey: ConstPtr<Propertykey>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescription(propkey.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSGetPropertyDescriptionByName(pszcanonicalname: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionByName(pszcanonicalname.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSGetPropertyDescriptionListFromString(pszproplist: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionListFromString(pszproplist.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSGetPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, rpkey: ConstPtr<Propertykey>, ppropvar: MutPtr<Propvariant>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyFromPropertyStorage(psps, cb, rpkey.rawAddress.toCPointer<ByteVar>(), ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun pSGetPropertyKeyFromName(pszname: Pcwstr, ppropkey: MutPtr<Propertykey>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyKeyFromName(pszname.rawAddress.toCPointer<ByteVar>(), ppropkey.rawAddress.toCPointer<ByteVar>())

public actual fun pSGetPropertySystem(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSGetPropertySystem(riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pSGetPropertyValue(pps: MutPtr<CVoid>, ppd: MutPtr<CVoid>, ppropvar: MutPtr<Propvariant>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyValue(pps.rawAddress.toCPointer<ByteVar>(), ppd.rawAddress.toCPointer<ByteVar>(), ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun pSLookupPropertyHandlerCLSID(pszfilepath: Pcwstr, pclsid: MutPtr<Guid>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSLookupPropertyHandlerCLSID(pszfilepath.rawAddress.toCPointer<ByteVar>(), pclsid.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagDelete(propbag: MutPtr<CVoid>, propname: Pcwstr): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagDelete(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadBool(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBool(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadBstr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Bstr>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBstr(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadDword(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadDword(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadGuid(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Guid>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadGuid(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadInt(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Int>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadInt(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadLong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Int>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadLong(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadPointl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Pointl>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPointl(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadPoints(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Points>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPoints(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadPropertyKey(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Propertykey>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPropertyKey(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadRectl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Rectl>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadRectl(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadShort(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Short>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadShort(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadStr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Pwstr, charactercount: Int): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStr(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), charactercount)

public actual fun pspropertyBagReadStrAlloc(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStrAlloc(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadStream(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStream(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadType(propbag: MutPtr<CVoid>, propname: Pcwstr, variable: MutPtr<Variant.Variant>, type: Variant.Varenum): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadType(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), variable.rawAddress.toCPointer<ByteVar>(), type)

public actual fun pspropertyBagReadUlonglong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<ULong>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUlonglong(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagReadUnknown(propbag: MutPtr<CVoid>, propname: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUnknown(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagWriteBool(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Bool): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBool(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value)

public actual fun pspropertyBagWriteBstr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Bstr): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBstr(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagWriteDword(propbag: MutPtr<CVoid>, propname: Pcwstr, value: UInt): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteDword(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value)

public actual fun pspropertyBagWriteGuid(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Guid>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteGuid(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagWriteInt(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Int): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteInt(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value)

public actual fun pspropertyBagWriteLong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Int): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteLong(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value)

public actual fun pspropertyBagWritePointl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Pointl>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePointl(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagWritePoints(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Points>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePoints(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagWritePropertyKey(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Propertykey>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePropertyKey(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagWriteRectl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Rectl>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteRectl(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagWriteShort(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Short): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteShort(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value)

public actual fun pspropertyBagWriteStr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Pcwstr): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStr(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagWriteStream(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStream(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pspropertyBagWriteUlonglong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ULong): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUlonglong(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), value)

public actual fun pspropertyBagWriteUnknown(propbag: MutPtr<CVoid>, propname: Pcwstr, punk: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUnknown(propbag.rawAddress.toCPointer<ByteVar>(), propname.rawAddress.toCPointer<ByteVar>(), punk.rawAddress.toCPointer<ByteVar>())

public actual fun pSPropertyKeyFromString(pszstring: Pcwstr, pkey: MutPtr<Propertykey>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSPropertyKeyFromString(pszstring.rawAddress.toCPointer<ByteVar>(), pkey.rawAddress.toCPointer<ByteVar>())

public actual fun pSRefreshPropertySchema(): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema()

public actual fun pSRegisterPropertySchema(pszpath: Pcwstr): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSRegisterPropertySchema(pszpath.rawAddress.toCPointer<ByteVar>())

public actual fun pSSetPropertyValue(pps: MutPtr<CVoid>, ppd: MutPtr<CVoid>, propvar: ConstPtr<Propvariant>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSSetPropertyValue(pps.rawAddress.toCPointer<ByteVar>(), ppd.rawAddress.toCPointer<ByteVar>(), propvar.rawAddress.toCPointer<ByteVar>())

public actual fun pSStringFromPropertyKey(pkey: ConstPtr<Propertykey>, psz: Pwstr, cch: UInt): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSStringFromPropertyKey(pkey.rawAddress.toCPointer<ByteVar>(), psz.rawAddress.toCPointer<ByteVar>(), cch)

public actual fun pSUnregisterPropertySchema(pszpath: Pcwstr): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemPSUnregisterPropertySchema(pszpath.rawAddress.toCPointer<ByteVar>())

public actual fun pifMgrCloseProperties(hprops: Handle, flopt: UInt): Handle =
    MutPtr(windowssysWindowsWin32UiShellPropertiessystemPifMgrCloseProperties(hprops.rawAddress.toCPointer<ByteVar>(), flopt)?.toLong() ?: 0L)

public actual fun pifMgrGetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: MutPtr<CVoid>, cbprops: Int, flopt: UInt): Int =
    windowssysWindowsWin32UiShellPropertiessystemPifMgrGetProperties(hprops.rawAddress.toCPointer<ByteVar>(), pszgroup.rawAddress.toCPointer<ByteVar>(), lpprops.rawAddress.toCPointer<ByteVar>(), cbprops, flopt)

public actual fun pifMgrOpenProperties(pszapp: Pcwstr, pszpif: Pcwstr, hinf: UInt, flopt: UInt): Handle =
    MutPtr(windowssysWindowsWin32UiShellPropertiessystemPifMgrOpenProperties(pszapp.rawAddress.toCPointer<ByteVar>(), pszpif.rawAddress.toCPointer<ByteVar>(), hinf, flopt)?.toLong() ?: 0L)

public actual fun pifMgrSetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: ConstPtr<CVoid>, cbprops: Int, flopt: UInt): Int =
    windowssysWindowsWin32UiShellPropertiessystemPifMgrSetProperties(hprops.rawAddress.toCPointer<ByteVar>(), pszgroup.rawAddress.toCPointer<ByteVar>(), lpprops.rawAddress.toCPointer<ByteVar>(), cbprops, flopt)

public actual fun sHAddDefaultPropertiesByExt(pszext: Pcwstr, ppropstore: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemSHAddDefaultPropertiesByExt(pszext.rawAddress.toCPointer<ByteVar>(), ppropstore.rawAddress.toCPointer<ByteVar>())

public actual fun sHGetPropertyStoreForWindow(hwnd: Hwnd, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreForWindow(hwnd.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun sHGetPropertyStoreFromIDList(pidl: ConstPtr<Itemidlist>, flags: Getpropertystoreflags, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromIDList(pidl.rawAddress.toCPointer<ByteVar>(), flags, riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun sHGetPropertyStoreFromParsingName(pszpath: Pcwstr, pbc: MutPtr<CVoid>, flags: Getpropertystoreflags, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromParsingName(pszpath.rawAddress.toCPointer<ByteVar>(), pbc.rawAddress.toCPointer<ByteVar>(), flags, riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun sHPropStgCreate(psstg: MutPtr<CVoid>, fmtid: ConstPtr<Guid>, pclsid: ConstPtr<Guid>, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: MutPtr<MutPtr<CVoid>>, pucodepage: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemSHPropStgCreate(psstg.rawAddress.toCPointer<ByteVar>(), fmtid.rawAddress.toCPointer<ByteVar>(), pclsid.rawAddress.toCPointer<ByteVar>(), grfflags, grfmode, dwdisposition, ppstg.rawAddress.toCPointer<ByteVar>(), pucodepage.rawAddress.toCPointer<ByteVar>())

public actual fun sHPropStgReadMultiple(pps: MutPtr<CVoid>, ucodepage: UInt, cpspec: UInt, rgpspec: ConstPtr<Propspec>, rgvar: MutPtr<Propvariant>): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemSHPropStgReadMultiple(pps.rawAddress.toCPointer<ByteVar>(), ucodepage, cpspec, rgpspec.rawAddress.toCPointer<ByteVar>(), rgvar.rawAddress.toCPointer<ByteVar>())

public actual fun sHPropStgWriteMultiple(pps: MutPtr<CVoid>, pucodepage: MutPtr<UInt>, cpspec: UInt, rgpspec: ConstPtr<Propspec>, rgvar: MutPtr<Propvariant>, propidnamefirst: UInt): Hresult =
    windowssysWindowsWin32UiShellPropertiessystemSHPropStgWriteMultiple(pps.rawAddress.toCPointer<ByteVar>(), pucodepage.rawAddress.toCPointer<ByteVar>(), cpspec, rgpspec.rawAddress.toCPointer<ByteVar>(), rgvar.rawAddress.toCPointer<ByteVar>(), propidnamefirst)
