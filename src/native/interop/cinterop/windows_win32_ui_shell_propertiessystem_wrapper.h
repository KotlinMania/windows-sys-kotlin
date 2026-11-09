#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCoerceToCanonicalValue(void* key, void* ppropvar);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreateAdapterFromPropertyStore(void* pps, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreateDelayedMultiplexPropertyStore(int32_t flags, void* pdpsf, void* rgstoreids, uint32_t cstores, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreateMemoryPropertyStore(void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreateMultiplexPropertyStore(void* prgpunkstores, uint32_t cstores, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyChangeArray(void* rgpropkey, void* rgflags, void* rgpropvar, uint32_t cchanges, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyStoreFromObject(void* punk, uint32_t grfmode, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyStoreFromPropertySetStorage(void* ppss, uint32_t grfmode, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSCreateSimplePropertyChange(int32_t flags, void* key, void* propvar, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSEnumeratePropertyDescriptions(int32_t filteron, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSFormatForDisplay(void* propkey, void* propvar, int32_t pdfflags, void* pwsztext, uint32_t cchtext);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSFormatForDisplayAlloc(void* key, void* propvar, int32_t pdff, void* ppszdisplay);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSFormatPropertyValue(void* pps, void* ppd, int32_t pdff, void* ppszdisplay);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetImageReferenceForValue(void* propkey, void* propvar, void* ppszimageres);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetItemPropertyHandler(void* punkitem, int32_t freadwrite, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetItemPropertyHandlerWithCreateObject(void* punkitem, int32_t freadwrite, void* punkcreateobject, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetNameFromPropertyKey(void* propkey, void* ppszcanonicalname);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetNamedPropertyFromPropertyStorage(int64_t psps, uint32_t cb, void* pszname, void* ppropvar);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescription(void* propkey, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescriptionByName(void* pszcanonicalname, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescriptionListFromString(void* pszproplist, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyFromPropertyStorage(int64_t psps, uint32_t cb, void* rpkey, void* ppropvar);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyKeyFromName(void* pszname, void* ppropkey);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertySystem(void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyValue(void* pps, void* ppd, void* ppropvar);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSLookupPropertyHandlerCLSID(void* pszfilepath, void* pclsid);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_Delete(void* propbag, void* propname);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadBOOL(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadBSTR(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadDWORD(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadGUID(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadInt(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadLONG(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPOINTL(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPOINTS(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPropertyKey(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadRECTL(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadSHORT(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStr(void* propbag, void* propname, void* value, int32_t charactercount);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStrAlloc(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStream(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadType(void* propbag, void* propname, void* var, uint16_t type);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadULONGLONG(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadUnknown(void* propbag, void* propname, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteBOOL(void* propbag, void* propname, int32_t value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteBSTR(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteDWORD(void* propbag, void* propname, uint32_t value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteGUID(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteInt(void* propbag, void* propname, int32_t value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteLONG(void* propbag, void* propname, int32_t value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePOINTL(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePOINTS(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePropertyKey(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteRECTL(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteSHORT(void* propbag, void* propname, int16_t value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteStr(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteStream(void* propbag, void* propname, void* value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteULONGLONG(void* propbag, void* propname, uint64_t value);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteUnknown(void* propbag, void* propname, void* punk);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyKeyFromString(void* pszstring, void* pkey);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSRefreshPropertySchema(void);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSRegisterPropertySchema(void* pszpath);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSSetPropertyValue(void* pps, void* ppd, void* propvar);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSStringFromPropertyKey(void* pkey, void* psz, uint32_t cch);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PSUnregisterPropertySchema(void* pszpath);
void* windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_CloseProperties(void* hprops, uint32_t flopt);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_GetProperties(void* hprops, void* pszgroup, void* lpprops, int32_t cbprops, uint32_t flopt);
void* windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_OpenProperties(void* pszapp, void* pszpif, uint32_t hinf, uint32_t flopt);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_SetProperties(void* hprops, void* pszgroup, void* lpprops, int32_t cbprops, uint32_t flopt);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_SHAddDefaultPropertiesByExt(void* pszext, void* ppropstore);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreForWindow(void* hwnd, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreFromIDList(void* pidl, int32_t flags, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreFromParsingName(void* pszpath, void* pbc, int32_t flags, void* riid, void* ppv);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgCreate(void* psstg, void* fmtid, void* pclsid, uint32_t grfflags, uint32_t grfmode, uint32_t dwdisposition, void* ppstg, void* pucodepage);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgReadMultiple(void* pps, uint32_t ucodepage, uint32_t cpspec, void* rgpspec, void* rgvar);
int32_t windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgWriteMultiple(void* pps, void* pucodepage, uint32_t cpspec, void* rgpspec, void* rgvar, uint32_t propidnamefirst);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WINDOWS_WIN32_UI_SHELL_PROPERTIESSYSTEM_WRAPPER_H */
