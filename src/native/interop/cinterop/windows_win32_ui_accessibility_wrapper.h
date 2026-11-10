#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_ACCESSIBILITY_WINDOWS_WIN32_UI_ACCESSIBILITY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_ACCESSIBILITY_WINDOWS_WIN32_UI_ACCESSIBILITY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_accessibility_accSetRunningUtilityState(void* hwndapp, uint32_t dwutilitystatemask, uint32_t dwutilitystate);
int32_t windowssys_windows_win32_ui_accessibility_accessibleChildren(void* pacccontainer, int32_t ichildstart, int32_t cchildren, void* rgvarchildren, void* pcobtained);
int32_t windowssys_windows_win32_ui_accessibility_accessibleObjectFromEvent(void* hwnd, uint32_t dwid, uint32_t dwchildid, void* ppacc, void* pvarchild);
int32_t windowssys_windows_win32_ui_accessibility_accessibleObjectFromWindow(void* hwnd, uint32_t dwid, void* riid, void* ppvobject);
int32_t windowssys_windows_win32_ui_accessibility_createStdAccessibleObject(void* hwnd, int32_t idobject, void* riid, void* ppvobject);
int32_t windowssys_windows_win32_ui_accessibility_createStdAccessibleProxyA(void* hwnd, void* pclassname, int32_t idobject, void* riid, void* ppvobject);
int32_t windowssys_windows_win32_ui_accessibility_createStdAccessibleProxyW(void* hwnd, void* pclassname, int32_t idobject, void* riid, void* ppvobject);
int32_t windowssys_windows_win32_ui_accessibility_dockPatternSetDockPosition(void* hobj, int32_t dockposition);
int32_t windowssys_windows_win32_ui_accessibility_expandCollapsePatternCollapse(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_expandCollapsePatternExpand(void* hobj);
void windowssys_windows_win32_ui_accessibility_getOleaccVersionInfo(void* pver, void* pbuild);
uint32_t windowssys_windows_win32_ui_accessibility_getRoleTextA(uint32_t lrole, void* lpszrole, uint32_t cchrolemax);
uint32_t windowssys_windows_win32_ui_accessibility_getRoleTextW(uint32_t lrole, void* lpszrole, uint32_t cchrolemax);
uint32_t windowssys_windows_win32_ui_accessibility_getStateTextA(uint32_t lstatebit, void* lpszstate, uint32_t cchstate);
uint32_t windowssys_windows_win32_ui_accessibility_getStateTextW(uint32_t lstatebit, void* lpszstate, uint32_t cchstate);
int32_t windowssys_windows_win32_ui_accessibility_gridPatternGetItem(void* hobj, int32_t row, int32_t column, void* presult);
int32_t windowssys_windows_win32_ui_accessibility_invokePatternInvoke(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_isWinEventHookInstalled(uint32_t event);
int32_t windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternDoDefaultAction(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternGetIaccessible(void* hobj, void* paccessible);
int32_t windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternSelect(void* hobj, int32_t flagsselect);
int32_t windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternSetValue(void* hobj, void* szvalue);
int64_t windowssys_windows_win32_ui_accessibility_lresultFromObject(void* riid, uint64_t wparam, void* punk);
int32_t windowssys_windows_win32_ui_accessibility_multipleViewPatternGetViewName(void* hobj, int32_t viewid, void* ppstr);
int32_t windowssys_windows_win32_ui_accessibility_multipleViewPatternSetCurrentView(void* hobj, int32_t viewid);
void windowssys_windows_win32_ui_accessibility_notifyWinEvent(uint32_t event, void* hwnd, int32_t idobject, int32_t idchild);
int32_t windowssys_windows_win32_ui_accessibility_objectFromLresult(int64_t lresult, void* riid, uint64_t wparam, void* ppvobject);
int32_t windowssys_windows_win32_ui_accessibility_rangeValuePatternSetValue(void* hobj, double val);
int32_t windowssys_windows_win32_ui_accessibility_registerPointerInputTarget(void* hwnd, int32_t pointertype);
int32_t windowssys_windows_win32_ui_accessibility_registerPointerInputTargetEx(void* hwnd, int32_t pointertype, int32_t fobserve);
int32_t windowssys_windows_win32_ui_accessibility_scrollItemPatternScrollIntoView(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_scrollPatternScroll(void* hobj, int32_t horizontalamount, int32_t verticalamount);
int32_t windowssys_windows_win32_ui_accessibility_scrollPatternSetScrollPercent(void* hobj, double horizontalpercent, double verticalpercent);
int32_t windowssys_windows_win32_ui_accessibility_selectionItemPatternAddToSelection(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_selectionItemPatternRemoveFromSelection(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_selectionItemPatternSelect(void* hobj);
void* windowssys_windows_win32_ui_accessibility_setWinEventHook(uint32_t eventmin, uint32_t eventmax, void* hmodwineventproc, void* pfnwineventproc, uint32_t idprocess, uint32_t idthread, uint32_t dwflags);
int32_t windowssys_windows_win32_ui_accessibility_synchronizedInputPatternCancel(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_synchronizedInputPatternStartListening(void* hobj, int32_t inputtype);
int32_t windowssys_windows_win32_ui_accessibility_textPatternGetSelection(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textPatternGetVisibleRanges(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textPatternRangeFromChild(void* hobj, void* hnodechild, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textPatternGetDocumentRange(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textPatternGetSupportedTextSelection(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textRangeAddToSelection(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_textRangeClone(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textRangeCompare(void* hobj, void* range, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textRangeCompareEndpoints(void* hobj, int32_t endpoint, void* targetrange, int32_t targetendpoint, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textRangeExpandToEnclosingUnit(void* hobj, int32_t unit);
int32_t windowssys_windows_win32_ui_accessibility_textRangeFindText(void* hobj, void* text, int32_t backward, int32_t ignorecase, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textRangeGetAttributeValue(void* hobj, int32_t attributeid, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textRangeGetBoundingRectangles(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textRangeGetChildren(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textRangeGetEnclosingElement(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textRangeGetText(void* hobj, int32_t maxlength, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textRangeMove(void* hobj, int32_t unit, int32_t count, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textRangeMoveEndpointByRange(void* hobj, int32_t endpoint, void* targetrange, int32_t targetendpoint);
int32_t windowssys_windows_win32_ui_accessibility_textRangeMoveEndpointByUnit(void* hobj, int32_t endpoint, int32_t unit, int32_t count, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_textRangeRemoveFromSelection(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_textRangeScrollIntoView(void* hobj, int32_t aligntotop);
int32_t windowssys_windows_win32_ui_accessibility_textRangeSelect(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_togglePatternToggle(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_transformPatternMove(void* hobj, double x, double y);
int32_t windowssys_windows_win32_ui_accessibility_transformPatternResize(void* hobj, double width, double height);
int32_t windowssys_windows_win32_ui_accessibility_transformPatternRotate(void* hobj, double degrees);
int32_t windowssys_windows_win32_ui_accessibility_uiaAddEvent(void* hnode, int32_t eventid, void* pcallback, int32_t scope, void* pproperties, int32_t cproperties, void* prequest, void* phevent);
int32_t windowssys_windows_win32_ui_accessibility_uiaClientsAreListening(void);
int32_t windowssys_windows_win32_ui_accessibility_uiaDisconnectAllProviders(void);
int32_t windowssys_windows_win32_ui_accessibility_uiaDisconnectProvider(void* pprovider);
int32_t windowssys_windows_win32_ui_accessibility_uiaEventAddWindow(void* hevent, void* hwnd);
int32_t windowssys_windows_win32_ui_accessibility_uiaEventRemoveWindow(void* hevent, void* hwnd);
int32_t windowssys_windows_win32_ui_accessibility_uiaFind(void* hnode, void* pparams, void* prequest, void* pprequesteddata, void* ppoffsets, void* pptreestructures);
int32_t windowssys_windows_win32_ui_accessibility_uiaGetErrorDescription(void* pdescription);
int32_t windowssys_windows_win32_ui_accessibility_uiaGetPatternProvider(void* hnode, int32_t patternid, void* phobj);
int32_t windowssys_windows_win32_ui_accessibility_uiaGetPropertyValue(void* hnode, int32_t propertyid, void* pvalue);
int32_t windowssys_windows_win32_ui_accessibility_uiaGetReservedMixedAttributeValue(void* punkmixedattributevalue);
int32_t windowssys_windows_win32_ui_accessibility_uiaGetReservedNotSupportedValue(void* punknotsupportedvalue);
int32_t windowssys_windows_win32_ui_accessibility_uiaGetRootNode(void* phnode);
int32_t windowssys_windows_win32_ui_accessibility_uiaGetRuntimeId(void* hnode, void* pruntimeid);
int32_t windowssys_windows_win32_ui_accessibility_uiaGetUpdatedCache(void* hnode, void* prequest, int32_t normalizestate, void* pnormalizecondition, void* pprequesteddata, void* pptreestructure);
int32_t windowssys_windows_win32_ui_accessibility_uiaHPatternObjectFromVariant(void* pvar, void* phobj);
int32_t windowssys_windows_win32_ui_accessibility_uiaHTextRangeFromVariant(void* pvar, void* phtextrange);
int32_t windowssys_windows_win32_ui_accessibility_uiaHUiaNodeFromVariant(void* pvar, void* phnode);
int32_t windowssys_windows_win32_ui_accessibility_uiaHasServerSideProvider(void* hwnd);
int32_t windowssys_windows_win32_ui_accessibility_uiaHostProviderFromHwnd(void* hwnd, void* ppprovider);
int32_t windowssys_windows_win32_ui_accessibility_uiaIAccessibleFromProvider(void* pprovider, uint32_t dwflags, void* ppaccessible, void* pvarchild);
int32_t windowssys_windows_win32_ui_accessibility_uiaLookupId(int32_t type, void* pguid);
int32_t windowssys_windows_win32_ui_accessibility_uiaNavigate(void* hnode, int32_t direction, void* pcondition, void* prequest, void* pprequesteddata, void* pptreestructure);
int32_t windowssys_windows_win32_ui_accessibility_uiaNodeFromFocus(void* prequest, void* pprequesteddata, void* pptreestructure);
int32_t windowssys_windows_win32_ui_accessibility_uiaNodeFromHandle(void* hwnd, void* phnode);
int32_t windowssys_windows_win32_ui_accessibility_uiaNodeFromPoint(double x, double y, void* prequest, void* pprequesteddata, void* pptreestructure);
int32_t windowssys_windows_win32_ui_accessibility_uiaNodeFromProvider(void* pprovider, void* phnode);
int32_t windowssys_windows_win32_ui_accessibility_uiaNodeRelease(void* hnode);
int32_t windowssys_windows_win32_ui_accessibility_uiaPatternRelease(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_uiaProviderForNonClient(void* hwnd, int32_t idobject, int32_t idchild, void* ppprovider);
int32_t windowssys_windows_win32_ui_accessibility_uiaProviderFromIAccessible(void* paccessible, int32_t idchild, uint32_t dwflags, void* ppprovider);
int32_t windowssys_windows_win32_ui_accessibility_uiaRaiseActiveTextPositionChangedEvent(void* provider, void* textrange);
int32_t windowssys_windows_win32_ui_accessibility_uiaRaiseAsyncContentLoadedEvent(void* pprovider, int32_t asynccontentloadedstate, double percentcomplete);
int32_t windowssys_windows_win32_ui_accessibility_uiaRaiseAutomationEvent(void* pprovider, int32_t id);
int32_t windowssys_windows_win32_ui_accessibility_uiaRaiseChangesEvent(void* pprovider, int32_t eventidcount, void* puiachanges);
int32_t windowssys_windows_win32_ui_accessibility_uiaRaiseNotificationEvent(void* provider, int32_t notificationkind, int32_t notificationprocessing, void* displaystring, void* activityid);
int32_t windowssys_windows_win32_ui_accessibility_uiaRaiseStructureChangedEvent(void* pprovider, int32_t structurechangetype, void* pruntimeid, int32_t cruntimeidlen);
int32_t windowssys_windows_win32_ui_accessibility_uiaRaiseTextEditTextChangedEvent(void* pprovider, int32_t texteditchangetype, void* pchangeddata);
void windowssys_windows_win32_ui_accessibility_uiaRegisterProviderCallback(void* pcallback);
int32_t windowssys_windows_win32_ui_accessibility_uiaRemoveEvent(void* hevent);
int64_t windowssys_windows_win32_ui_accessibility_uiaReturnRawElementProvider(void* hwnd, uint64_t wparam, int64_t lparam, void* el);
int32_t windowssys_windows_win32_ui_accessibility_uiaSetFocus(void* hnode);
int32_t windowssys_windows_win32_ui_accessibility_uiaTextRangeRelease(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_unhookWinEvent(void* hwineventhook);
int32_t windowssys_windows_win32_ui_accessibility_unregisterPointerInputTarget(void* hwnd, int32_t pointertype);
int32_t windowssys_windows_win32_ui_accessibility_unregisterPointerInputTargetEx(void* hwnd, int32_t pointertype);
int32_t windowssys_windows_win32_ui_accessibility_valuePatternSetValue(void* hobj, void* pval);
int32_t windowssys_windows_win32_ui_accessibility_virtualizedItemPatternRealize(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_windowFromAccessibleObject(void* param0, void* phwnd);
int32_t windowssys_windows_win32_ui_accessibility_windowPatternClose(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_windowPatternSetWindowVisualState(void* hobj, int32_t state);
int32_t windowssys_windows_win32_ui_accessibility_windowPatternWaitForInputIdle(void* hobj, int32_t milliseconds, void* presult);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_ACCESSIBILITY_WINDOWS_WIN32_UI_ACCESSIBILITY_WRAPPER_H */
