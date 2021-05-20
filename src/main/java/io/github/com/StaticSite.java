package io.github.com;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Frame;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Text;
import com.epam.jdi.tools.DataClass;
import io.github.com.pages.displaydata.*;
import io.github.com.pages.inputs.CheckboxPage;
import io.github.com.pages.inputs.RadioButtonPage;
import io.github.com.pages.surfaces.CardPage;
import io.github.com.pages.utils.*;

@JSite("https://jdi-testing.github.io/jdi-light/material/")
public class StaticSite {



    @Url("/material-ui-inputs-transfer-list--simple-transfer-list-view")
    public static WebPage inputSimpleTransferListPage;



    @Url("/material-ui-inputs-transfer-list--enhanced-transfer-list-view")
    public static WebPage inputEnhancedTransferListPage;



    // radio
    @Url("/radio")
    public static RadioButtonPage radioButtonPage;



    @Url("/material-ui-inputs-text-field--standard")
    public static WebPage inputTextFieldStandardPage;

    @Url("/material-ui-inputs-text-field--field-with-default")
    public static WebPage inputTextFieldFilledWithDefaultPage;

    @Url("/material-ui-inputs-text-field--filled")
    public static WebPage inputTextFieldFilledPage;

    @Url("/material-ui-inputs-text-field--disabled")
    public static WebPage inputTextFieldDisabledPage;

    @Url("/material-ui-inputs-text-field--time")
    public static WebPage inputTextFieldTimePage;

    //checkbox
    @Url("/checkboxes")
    public static CheckboxPage checkboxPage;



    @Url("/material-ui-inputs-button-group--default")
    public static WebPage inputButtonGroupDefaultPage;

    @Url("/material-ui-inputs-button-group--disabled")
    public static WebPage inputButtonGroupDisabledPage;

    @Url("/material-ui-inputs-button-group--split-button")
    public static WebPage inputButtonGroupSplitPage;



    @Url("/material-ui-inputs-sliders--default-and-disabled-sliders")
    public static WebPage inputSliderDefaultAnfDisabledPage;

    @Url("/material-ui-inputs-sliders--range-slider")
    public static WebPage inputSliderRangePage;

    @Url("/material-ui-inputs-sliders--vertical-slider")
    public static WebPage inputSliderVerticalPage;



    @Url("/appbar_bottom")
    public static WebPage bottomAppBarPage;

    @Url("/appbar_scroll_hide")
    public static WebPage hideAppBarPage;

    @Url("/appbar_elevate")
    public static WebPage elevateAppBarPage;

    @Url("/appbar_back_to_top")
    public static WebPage backToTopPage;



    @Url("/material-ui-surfaces-app-bar--simple-app-bar")
    public static WebPage surfaceSimpleAppBarPage;

    @Url("/card_surface")
    public static CardPage cardPage;



    @Url("/material-ui-data-display-dividers--inset-dividers-view")
    public static WebPage dataDisplayInsetDividerPage;



    @Url("/material-ui-data-display-dividers--vertical-dividers-view")
    public static WebPage dataDisplayVerticalDividerPage;



    @Url("/avatar")
    public static AvatarPage avatarPage;



    @Url("/material-ui-inputs-checkbox--group")
    public static WebPage groupCheckBoxPage;



    @Url("/material-ui-utils-modal--transitions-modal")
    public static WebPage transitionsModalPage;

    @Url("/material-ui-utils-modal--server-modal")
    public static WebPage serverSideModalPage;



    @Url("/material-ui-utils-popper--simple")
    public static WebPage utilsSimplePopperPage;

    @Url("/material-ui-utils-popper--transitions")
    public static WebPage utilsTransitionsPopperPage;

    @Url("/material-ui-utils-popper--positioned")
    public static WebPage utilsPositionedPoppersPage;



    @Url("/material-ui-data-display-tooltip--default")
    public static WebPage displayDataTooltipDefaultPage;

    @Url("/material-ui-data-display-tooltip--interactive")
    public static WebPage displayDataTooltipInteractivePage;



    @Url("/material-ui-data-display-table--simple")
    public static WebPage displayDataSimpleTablePage;

    @Url("/material-ui-data-display-table--dense")
    public static WebPage displayDataDenseTablePage;

    @Url("/material-ui-data-display-table--sticky-header")
    public static WebPage displayDataStickyHeaderTablePage;

    @Url("/material-ui-data-display-table--table-with-pagination")
    public static WebPage displayDataTableWithPaginationPage;

    @Url("/material-ui-data-display-table--sorting-table")
    public static WebPage displayDataSortingTablePage;

    @Url("/material-ui-data-display-table--spanning-table")
    public static WebPage displayDataSpanningTablePage;



    @Url("/material-ui-data-display-chips--default-chip")
    public static WebPage displayDataDefaultChipPage;

    @Url("/material-ui-data-display-chips--outlined-chip")
    public static WebPage displayDataOutlinedChipPage;

    @Url("/material-ui-data-display-chips--chip-array")
    public static WebPage displayDataArrayChipPage;

    @Url("/material-ui-data-display-chips--small-default-chip")
    public static WebPage displayDataSmallDefaultChipPage;

    @Url("/material-ui-data-display-chips--small-outlined-chip")
    public static WebPage displayDataSmallOutlinedChipPage;



    @Url("/material-ui-data-display-lists--simple-list")
    public static WebPage dataDisplayListsSimpleListPage;

    @Url("/material-ui-data-display-lists--checkbox-list")
    public static WebPage dataDisplayCheckboxListPage;

    @Url("/material-ui-data-display-lists--pinned-subheader-list")
    public static WebPage dataPinnedSubheaderListPage;



    @Url("/material-ui-feedback-backdrop--default-backdrop")
    public static WebPage feedbackBackdropDefaultPage;

    // circular
    @Url("/material-ui-feedback-progress--circular-indeterminate")
    public static WebPage circularIndeterminatePage;

    @Url("/material-ui-feedback-progress--circular-determinate")
    public static WebPage circularDeterminatePage;

    @Url("/material-ui-feedback-progress--circular-integration")
    public static WebPage circularIntegrationPage;

    @Url("/material-ui-feedback-progress--circular-with-value-label")
    public static WebPage circularWithValueLabel;



    @Url("/material-ui-feedback-progress--linear-indeterminate")
    public static WebPage linearIndeterminatePage;

    @Url("/material-ui-feedback-progress--linear-determinate")
    public static WebPage linearDeterminatePage;

    @Url("/material-ui-feedback-progress--linear-buffer")
    public static WebPage linearBufferPage;

    @Url("/material-ui-feedback-progress--linear-with-value-label")
    public static WebPage linearWithLabelPage;

    @Url("/material-ui-feedback-progress--customized-progress-bars")
    public static WebPage customisedProgressPage;

    @Url("/material-ui-feedback-progress--delaying-appearance")
    public static WebPage delayingAppearancePage;



    @Url("/material-ui-navigation-tabs--default")
    public static WebPage defaultTabPage;

    @Url("/material-ui-navigation-tabs--disabled-tab-example")
    public static WebPage disabledTabPage;

    @Url("/material-ui-navigation-tabs--scrollable-tab-example")
    public static WebPage scrollableTabPage;

    @Url("/material-ui-navigation-tabs--vertical-tab-example")
    public static WebPage verticalTabPage;



    // utils
    // Click away listener
    @Url("/click_away_listener")
    public static ClickAwayListenerPage clickAwayListenerPage;



    // utils
    // Click away listener

    @Frame("storybook-preview-iframe")
    public static ClickAwayListenerPage clickAwayListenerFrame;


    @Url("/material-ui-utils-click-away-listener--default")
    public static WebPage utilsClickAwayListenerDefaultPage;

    @Url("/material-ui-utils-click-away-listener--portal-example")
    public static WebPage utilsClickAwayListenerPortalExamplePage;



    @Url("/material-ui-utils-portal--default")
    public static WebPage defaultPortalPage;



    @Url("/simple_breadcrumbs")
    public static WebPage simpleBreadcrumbsPage;

    @Url("/router_breadcrumbs")
    public static WebPage routerIntegrationBreadcrumbsPage;


    @Url("/material-ui-navigation-breadcrumbs--customized")
    public static WebPage customizedBreadcrumbsPage;



    @Url("/material-ui-navigation-stepper--horizontal-linear-stepper")
    public static WebPage navigationStepperHorizontalLinearStepperPage;

    @Url("/material-ui-navigation-stepper--stepper-with-optional-step")
    public static WebPage navigationStepperWithOptionalStepPage;

    @Url("/material-ui-navigation-stepper--nonlinear-stepper")
    public static WebPage navigationStepperNonlinearStepperPage;



    @Url("/material-ui-navigation-link--default")
    public static WebPage defaultLinkPage;

    @Url("/material-ui-navigation-link--secondary")
    public static WebPage secondaryLinkPage;

    @Url("/material-ui-navigation-link--text-primary")
    public static WebPage textPrimaryLinkPage;

    @Url("/material-ui-navigation-link--text-secondary")
    public static WebPage textSecondaryLinkPage;

    @Url("/material-ui-navigation-link--error")
    public static WebPage errorLinkPage;

    @Url("/material-ui-navigation-link--underline-always")
    public static WebPage underlineAlwaysLinkPage;


    @Url("/material-ui-navigation-menu--simple-menu")
    public static WebPage simpleMenuPage;

    @Url("/material-ui-navigation-menu--scroll-menu")
    public static WebPage scrollMenuPage;

    @Url("/material-ui-navigation-menu--selected-with-vertical-positioning")
    public static WebPage selectedVerticalPositioningPage;

    @Url("/material-ui-navigation-menu--selected-no-vertical-positioning")
    public static WebPage selectedNoVerticalPositioningPage;

    @Url("/material-ui-navigation-menu--menu-list-with-positioning")
    public static WebPage positioningMenuPage;

    @Url("/material-ui-navigation-menu--context-menu")
    public static WebPage contextMenuPage;

    @Url("/material-ui-navigation-menu--menu-with-icons")
    public static WebPage menuWithIconsPage;


    @Url("/material-ui-layout-hidden--default-hidden")
    public static WebPage defaultHiddenPage;



    @Url("/material-ui-layout-container--default")
    public static WebPage defaultContainerPage;


    @Url("/material-ui-layout-grid--grid-view")
    public static WebPage defaultGridPage;

    // login page
    @UI("#login-form")
    public static Form<User> loginForm;

    @Css(".logout")
    public static Button logout;
    public static Button userIcon;
    public static Text userName;

    public static class User extends DataClass<User> {
        public String name = "Roman";
        public String password = "Jdi1234";
    }
}
