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

public expect fun pSCoerceToCanonicalValue(key: ConstPtr<Propertykey>, ppropvar: MutPtr<Propvariant>): Hresult

public expect fun pSCreateAdapterFromPropertyStore(pps: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSCreateDelayedMultiplexPropertyStore(flags: Getpropertystoreflags, pdpsf: MutPtr<CVoid>, rgstoreids: ConstPtr<UInt>, cstores: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSCreateMemoryPropertyStore(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSCreateMultiplexPropertyStore(prgpunkstores: ConstPtr<MutPtr<CVoid>>, cstores: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSCreatePropertyChangeArray(rgpropkey: ConstPtr<Propertykey>, rgflags: ConstPtr<PkaFlags>, rgpropvar: ConstPtr<Propvariant>, cchanges: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSCreatePropertyStoreFromObject(punk: MutPtr<CVoid>, grfmode: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSCreatePropertyStoreFromPropertySetStorage(ppss: MutPtr<CVoid>, grfmode: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSCreateSimplePropertyChange(flags: PkaFlags, key: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSEnumeratePropertyDescriptions(filteron: PropdescEnumfilter, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSFormatForDisplay(propkey: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, pdfflags: PropdescFormatFlags, pwsztext: Pwstr, cchtext: UInt): Hresult

public expect fun pSFormatForDisplayAlloc(key: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, pdff: PropdescFormatFlags, ppszdisplay: MutPtr<Pwstr>): Hresult

public expect fun pSFormatPropertyValue(pps: MutPtr<CVoid>, ppd: MutPtr<CVoid>, pdff: PropdescFormatFlags, ppszdisplay: MutPtr<Pwstr>): Hresult

public expect fun pSGetImageReferenceForValue(propkey: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>, ppszimageres: MutPtr<Pwstr>): Hresult

public expect fun pSGetItemPropertyHandler(punkitem: MutPtr<CVoid>, freadwrite: Bool, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSGetItemPropertyHandlerWithCreateObject(punkitem: MutPtr<CVoid>, freadwrite: Bool, punkcreateobject: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSGetNameFromPropertyKey(propkey: ConstPtr<Propertykey>, ppszcanonicalname: MutPtr<Pwstr>): Hresult

public expect fun pSGetNamedPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, pszname: Pcwstr, ppropvar: MutPtr<Propvariant>): Hresult

public expect fun pSGetPropertyDescription(propkey: ConstPtr<Propertykey>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSGetPropertyDescriptionByName(pszcanonicalname: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSGetPropertyDescriptionListFromString(pszproplist: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSGetPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, rpkey: ConstPtr<Propertykey>, ppropvar: MutPtr<Propvariant>): Hresult

public expect fun pSGetPropertyKeyFromName(pszname: Pcwstr, ppropkey: MutPtr<Propertykey>): Hresult

public expect fun pSGetPropertySystem(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pSGetPropertyValue(pps: MutPtr<CVoid>, ppd: MutPtr<CVoid>, ppropvar: MutPtr<Propvariant>): Hresult

public expect fun pSLookupPropertyHandlerCLSID(pszfilepath: Pcwstr, pclsid: MutPtr<Guid>): Hresult

public expect fun pspropertyBagDelete(propbag: MutPtr<CVoid>, propname: Pcwstr): Hresult

public expect fun pspropertyBagReadBool(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Bool>): Hresult

public expect fun pspropertyBagReadBstr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Bstr>): Hresult

public expect fun pspropertyBagReadDword(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<UInt>): Hresult

public expect fun pspropertyBagReadGuid(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Guid>): Hresult

public expect fun pspropertyBagReadInt(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Int>): Hresult

public expect fun pspropertyBagReadLong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Int>): Hresult

public expect fun pspropertyBagReadPointl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Pointl>): Hresult

public expect fun pspropertyBagReadPoints(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Points>): Hresult

public expect fun pspropertyBagReadPropertyKey(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Propertykey>): Hresult

public expect fun pspropertyBagReadRectl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Rectl>): Hresult

public expect fun pspropertyBagReadShort(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Short>): Hresult

public expect fun pspropertyBagReadStr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Pwstr, charactercount: Int): Hresult

public expect fun pspropertyBagReadStrAlloc(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<Pwstr>): Hresult

public expect fun pspropertyBagReadStream(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pspropertyBagReadType(propbag: MutPtr<CVoid>, propname: Pcwstr, variable: MutPtr<Variant.Variant>, type: Variant.Varenum): Hresult

public expect fun pspropertyBagReadUlonglong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<ULong>): Hresult

public expect fun pspropertyBagReadUnknown(propbag: MutPtr<CVoid>, propname: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun pspropertyBagWriteBool(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Bool): Hresult

public expect fun pspropertyBagWriteBstr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Bstr): Hresult

public expect fun pspropertyBagWriteDword(propbag: MutPtr<CVoid>, propname: Pcwstr, value: UInt): Hresult

public expect fun pspropertyBagWriteGuid(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Guid>): Hresult

public expect fun pspropertyBagWriteInt(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Int): Hresult

public expect fun pspropertyBagWriteLong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Int): Hresult

public expect fun pspropertyBagWritePointl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Pointl>): Hresult

public expect fun pspropertyBagWritePoints(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Points>): Hresult

public expect fun pspropertyBagWritePropertyKey(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Propertykey>): Hresult

public expect fun pspropertyBagWriteRectl(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ConstPtr<Rectl>): Hresult

public expect fun pspropertyBagWriteShort(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Short): Hresult

public expect fun pspropertyBagWriteStr(propbag: MutPtr<CVoid>, propname: Pcwstr, value: Pcwstr): Hresult

public expect fun pspropertyBagWriteStream(propbag: MutPtr<CVoid>, propname: Pcwstr, value: MutPtr<CVoid>): Hresult

public expect fun pspropertyBagWriteUlonglong(propbag: MutPtr<CVoid>, propname: Pcwstr, value: ULong): Hresult

public expect fun pspropertyBagWriteUnknown(propbag: MutPtr<CVoid>, propname: Pcwstr, punk: MutPtr<CVoid>): Hresult

public expect fun pSPropertyKeyFromString(pszstring: Pcwstr, pkey: MutPtr<Propertykey>): Hresult

public expect fun pSRefreshPropertySchema(): Hresult

public expect fun pSRegisterPropertySchema(pszpath: Pcwstr): Hresult

public expect fun pSSetPropertyValue(pps: MutPtr<CVoid>, ppd: MutPtr<CVoid>, propvar: ConstPtr<Propvariant>): Hresult

public expect fun pSStringFromPropertyKey(pkey: ConstPtr<Propertykey>, psz: Pwstr, cch: UInt): Hresult

public expect fun pSUnregisterPropertySchema(pszpath: Pcwstr): Hresult

public expect fun pifMgrCloseProperties(hprops: Handle, flopt: UInt): Handle

public expect fun pifMgrGetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: MutPtr<CVoid>, cbprops: Int, flopt: UInt): Int

public expect fun pifMgrOpenProperties(pszapp: Pcwstr, pszpif: Pcwstr, hinf: UInt, flopt: UInt): Handle

public expect fun pifMgrSetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: ConstPtr<CVoid>, cbprops: Int, flopt: UInt): Int

public expect fun sHAddDefaultPropertiesByExt(pszext: Pcwstr, ppropstore: MutPtr<CVoid>): Hresult

public expect fun sHGetPropertyStoreForWindow(hwnd: Hwnd, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHGetPropertyStoreFromIDList(pidl: ConstPtr<Itemidlist>, flags: Getpropertystoreflags, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHGetPropertyStoreFromParsingName(pszpath: Pcwstr, pbc: MutPtr<CVoid>, flags: Getpropertystoreflags, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHPropStgCreate(psstg: MutPtr<CVoid>, fmtid: ConstPtr<Guid>, pclsid: ConstPtr<Guid>, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: MutPtr<MutPtr<CVoid>>, pucodepage: MutPtr<UInt>): Hresult

public expect fun sHPropStgReadMultiple(pps: MutPtr<CVoid>, ucodepage: UInt, cpspec: UInt, rgpspec: ConstPtr<Propspec>, rgvar: MutPtr<Propvariant>): Hresult

public expect fun sHPropStgWriteMultiple(pps: MutPtr<CVoid>, pucodepage: MutPtr<UInt>, cpspec: UInt, rgpspec: ConstPtr<Propspec>, rgvar: MutPtr<Propvariant>, propidnamefirst: UInt): Hresult
