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
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum

public expect fun pSCoerceToCanonicalValue(key: ConstPtr, ppropvar: MutPtr): Hresult

public expect fun pSCreateAdapterFromPropertyStore(pps: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSCreateDelayedMultiplexPropertyStore(flags: Getpropertystoreflags, pdpsf: MutPtr, rgstoreids: ConstPtr, cstores: UInt, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSCreateMemoryPropertyStore(riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSCreateMultiplexPropertyStore(prgpunkstores: ConstPtr, cstores: UInt, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSCreatePropertyChangeArray(rgpropkey: ConstPtr, rgflags: ConstPtr, rgpropvar: ConstPtr, cchanges: UInt, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSCreatePropertyStoreFromObject(punk: MutPtr, grfmode: UInt, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSCreatePropertyStoreFromPropertySetStorage(ppss: MutPtr, grfmode: UInt, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSCreateSimplePropertyChange(flags: PkaFlags, key: ConstPtr, propvar: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSEnumeratePropertyDescriptions(filteron: PropdescEnumfilter, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSFormatForDisplay(propkey: ConstPtr, propvar: ConstPtr, pdfflags: PropdescFormatFlags, pwsztext: Pwstr, cchtext: UInt): Hresult

public expect fun pSFormatForDisplayAlloc(key: ConstPtr, propvar: ConstPtr, pdff: PropdescFormatFlags, ppszdisplay: MutPtr): Hresult

public expect fun pSFormatPropertyValue(pps: MutPtr, ppd: MutPtr, pdff: PropdescFormatFlags, ppszdisplay: MutPtr): Hresult

public expect fun pSGetImageReferenceForValue(propkey: ConstPtr, propvar: ConstPtr, ppszimageres: MutPtr): Hresult

public expect fun pSGetItemPropertyHandler(punkitem: MutPtr, freadwrite: Bool, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSGetItemPropertyHandlerWithCreateObject(punkitem: MutPtr, freadwrite: Bool, punkcreateobject: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSGetNameFromPropertyKey(propkey: ConstPtr, ppszcanonicalname: MutPtr): Hresult

public expect fun pSGetNamedPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, pszname: Pcwstr, ppropvar: MutPtr): Hresult

public expect fun pSGetPropertyDescription(propkey: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSGetPropertyDescriptionByName(pszcanonicalname: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSGetPropertyDescriptionListFromString(pszproplist: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSGetPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, rpkey: ConstPtr, ppropvar: MutPtr): Hresult

public expect fun pSGetPropertyKeyFromName(pszname: Pcwstr, ppropkey: MutPtr): Hresult

public expect fun pSGetPropertySystem(riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pSGetPropertyValue(pps: MutPtr, ppd: MutPtr, ppropvar: MutPtr): Hresult

public expect fun pSLookupPropertyHandlerCLSID(pszfilepath: Pcwstr, pclsid: MutPtr): Hresult

public expect fun pspropertyBagDelete(propbag: MutPtr, propname: Pcwstr): Hresult

public expect fun pspropertyBagReadBool(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagReadBstr(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagReadDword(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagReadGuid(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagReadInt(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagReadLong(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagReadPointl(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagReadPoints(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagReadPropertyKey(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagReadRectl(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagReadShort(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagReadStr(propbag: MutPtr, propname: Pcwstr, value: Pwstr, charactercount: Int): Hresult

public expect fun pspropertyBagReadStrAlloc(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagReadStream(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagReadType(propbag: MutPtr, propname: Pcwstr, variable: MutPtr, type: Varenum): Hresult

public expect fun pspropertyBagReadUlonglong(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagReadUnknown(propbag: MutPtr, propname: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun pspropertyBagWriteBool(propbag: MutPtr, propname: Pcwstr, value: Bool): Hresult

public expect fun pspropertyBagWriteBstr(propbag: MutPtr, propname: Pcwstr, value: Bstr): Hresult

public expect fun pspropertyBagWriteDword(propbag: MutPtr, propname: Pcwstr, value: UInt): Hresult

public expect fun pspropertyBagWriteGuid(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult

public expect fun pspropertyBagWriteInt(propbag: MutPtr, propname: Pcwstr, value: Int): Hresult

public expect fun pspropertyBagWriteLong(propbag: MutPtr, propname: Pcwstr, value: Int): Hresult

public expect fun pspropertyBagWritePointl(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult

public expect fun pspropertyBagWritePoints(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult

public expect fun pspropertyBagWritePropertyKey(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult

public expect fun pspropertyBagWriteRectl(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult

public expect fun pspropertyBagWriteShort(propbag: MutPtr, propname: Pcwstr, value: Short): Hresult

public expect fun pspropertyBagWriteStr(propbag: MutPtr, propname: Pcwstr, value: Pcwstr): Hresult

public expect fun pspropertyBagWriteStream(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult

public expect fun pspropertyBagWriteUlonglong(propbag: MutPtr, propname: Pcwstr, value: ULong): Hresult

public expect fun pspropertyBagWriteUnknown(propbag: MutPtr, propname: Pcwstr, punk: MutPtr): Hresult

public expect fun pSPropertyKeyFromString(pszstring: Pcwstr, pkey: MutPtr): Hresult

public expect fun pSRefreshPropertySchema(): Hresult

public expect fun pSRegisterPropertySchema(pszpath: Pcwstr): Hresult

public expect fun pSSetPropertyValue(pps: MutPtr, ppd: MutPtr, propvar: ConstPtr): Hresult

public expect fun pSStringFromPropertyKey(pkey: ConstPtr, psz: Pwstr, cch: UInt): Hresult

public expect fun pSUnregisterPropertySchema(pszpath: Pcwstr): Hresult

public expect fun pifMgrCloseProperties(hprops: Handle, flopt: UInt): Handle

public expect fun pifMgrGetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: MutPtr, cbprops: Int, flopt: UInt): Int

public expect fun pifMgrOpenProperties(pszapp: Pcwstr, pszpif: Pcwstr, hinf: UInt, flopt: UInt): Handle

public expect fun pifMgrSetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: ConstPtr, cbprops: Int, flopt: UInt): Int

public expect fun sHAddDefaultPropertiesByExt(pszext: Pcwstr, ppropstore: MutPtr): Hresult

public expect fun sHGetPropertyStoreForWindow(hwnd: Hwnd, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHGetPropertyStoreFromIDList(pidl: ConstPtr, flags: Getpropertystoreflags, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHGetPropertyStoreFromParsingName(pszpath: Pcwstr, pbc: MutPtr, flags: Getpropertystoreflags, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHPropStgCreate(psstg: MutPtr, fmtid: ConstPtr, pclsid: ConstPtr, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: MutPtr, pucodepage: MutPtr): Hresult

public expect fun sHPropStgReadMultiple(pps: MutPtr, ucodepage: UInt, cpspec: UInt, rgpspec: ConstPtr, rgvar: MutPtr): Hresult

public expect fun sHPropStgWriteMultiple(pps: MutPtr, pucodepage: MutPtr, cpspec: UInt, rgpspec: ConstPtr, rgvar: MutPtr, propidnamefirst: UInt): Hresult
