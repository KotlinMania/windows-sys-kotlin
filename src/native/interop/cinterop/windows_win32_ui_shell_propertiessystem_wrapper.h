#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32UiShellPropertiessystemPSCoerceToCanonicalValue(void* key, void* ppropvar);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSCreateAdapterFromPropertyStore(void* pps, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSCreateDelayedMultiplexPropertyStore(int32_t flags, void* pdpsf, void* rgstoreids, uint32_t cstores, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSCreateMemoryPropertyStore(void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSCreateMultiplexPropertyStore(void* prgpunkstores, uint32_t cstores, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyChangeArray(void* rgpropkey, void* rgflags, void* rgpropvar, uint32_t cchanges, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromObject(void* punk, uint32_t grfmode, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromPropertySetStorage(void* ppss, uint32_t grfmode, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSCreateSimplePropertyChange(int32_t flags, void* key, void* propvar, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSEnumeratePropertyDescriptions(int32_t filteron, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplay(void* propkey, void* propvar, int32_t pdfflags, void* pwsztext, uint32_t cchtext);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplayAlloc(void* key, void* propvar, int32_t pdff, void* ppszdisplay);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSFormatPropertyValue(void* pps, void* ppd, int32_t pdff, void* ppszdisplay);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSGetImageReferenceForValue(void* propkey, void* propvar, void* ppszimageres);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandler(void* punkitem, int32_t freadwrite, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandlerWithCreateObject(void* punkitem, int32_t freadwrite, void* punkcreateobject, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSGetNameFromPropertyKey(void* propkey, void* ppszcanonicalname);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSGetNamedPropertyFromPropertyStorage(int64_t psps, uint32_t cb, void* pszname, void* ppropvar);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescription(void* propkey, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionByName(void* pszcanonicalname, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionListFromString(void* pszproplist, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyFromPropertyStorage(int64_t psps, uint32_t cb, void* rpkey, void* ppropvar);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyKeyFromName(void* pszname, void* ppropkey);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSGetPropertySystem(void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyValue(void* pps, void* ppd, void* ppropvar);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSLookupPropertyHandlerCLSID(void* pszfilepath, void* pclsid);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagDelete(void* propbag, void* propname);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBool(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBstr(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadDword(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadGuid(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadInt(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadLong(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPointl(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPoints(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPropertyKey(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadRectl(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadShort(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStr(void* propbag, void* propname, void* value, int32_t charactercount);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStrAlloc(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStream(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadType(void* propbag, void* propname, void* var, uint16_t type);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUlonglong(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUnknown(void* propbag, void* propname, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBool(void* propbag, void* propname, int32_t value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBstr(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteDword(void* propbag, void* propname, uint32_t value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteGuid(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteInt(void* propbag, void* propname, int32_t value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteLong(void* propbag, void* propname, int32_t value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePointl(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePoints(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePropertyKey(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteRectl(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteShort(void* propbag, void* propname, int16_t value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStr(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStream(void* propbag, void* propname, void* value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUlonglong(void* propbag, void* propname, uint64_t value);
int32_t windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUnknown(void* propbag, void* propname, void* punk);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSPropertyKeyFromString(void* pszstring, void* pkey);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema(void);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSRegisterPropertySchema(void* pszpath);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSSetPropertyValue(void* pps, void* ppd, void* propvar);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSStringFromPropertyKey(void* pkey, void* psz, uint32_t cch);
int32_t windowssysWindowsWin32UiShellPropertiessystemPSUnregisterPropertySchema(void* pszpath);
void* windowssysWindowsWin32UiShellPropertiessystemPifMgrCloseProperties(void* hprops, uint32_t flopt);
int32_t windowssysWindowsWin32UiShellPropertiessystemPifMgrGetProperties(void* hprops, void* pszgroup, void* lpprops, int32_t cbprops, uint32_t flopt);
void* windowssysWindowsWin32UiShellPropertiessystemPifMgrOpenProperties(void* pszapp, void* pszpif, uint32_t hinf, uint32_t flopt);
int32_t windowssysWindowsWin32UiShellPropertiessystemPifMgrSetProperties(void* hprops, void* pszgroup, void* lpprops, int32_t cbprops, uint32_t flopt);
int32_t windowssysWindowsWin32UiShellPropertiessystemSHAddDefaultPropertiesByExt(void* pszext, void* ppropstore);
int32_t windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreForWindow(void* hwnd, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromIDList(void* pidl, int32_t flags, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromParsingName(void* pszpath, void* pbc, int32_t flags, void* riid, void* ppv);
int32_t windowssysWindowsWin32UiShellPropertiessystemSHPropStgCreate(void* psstg, void* fmtid, void* pclsid, uint32_t grfflags, uint32_t grfmode, uint32_t dwdisposition, void* ppstg, void* pucodepage);
int32_t windowssysWindowsWin32UiShellPropertiessystemSHPropStgReadMultiple(void* pps, uint32_t ucodepage, uint32_t cpspec, void* rgpspec, void* rgvar);
int32_t windowssysWindowsWin32UiShellPropertiessystemSHPropStgWriteMultiple(void* pps, void* pucodepage, uint32_t cpspec, void* rgpspec, void* rgvar, uint32_t propidnamefirst);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WRAPPER_H */
