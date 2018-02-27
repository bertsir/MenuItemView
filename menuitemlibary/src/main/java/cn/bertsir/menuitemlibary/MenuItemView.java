package cn.bertsir.menuitemlibary;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Bert on 2018/2/27.
 */

public class MenuItemView extends FrameLayout {


    private int leftImgRes;
    private float leftImgWidht;
    private float leftImgHeight;
    private float leftImgMarginLeft;
    private String content;
    private float contentSize;
    private float contentMarginLeft;
    private int contentColor;
    private boolean showRedPoint;
    private float redPointSize;
    private int redPointColor;
    private int rightImgRes;
    private float rightImgWidht;
    private float rightImgHeight;
    private float rightImgMarginRight;
    private int spliteLineColor;
    private float spliteLineMarginLeft;
    private float spliteLineMarginRight;
    private float spliteLineHegiht;
    private boolean showSpliteLine;
    private ImageView iv_menu_item_bottom;
    private ImageView iv_menu_item_left;
    private ImageView iv_menu_item_right;
    private RedPointView rpv_menu_item;
    private TextView tv_menu_item_content;

    public MenuItemView(Context context) {
        super(context);
    }

    public MenuItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.MenuItemView);

        leftImgRes = array.getResourceId(R.styleable.MenuItemView_leftImgRes, 0);
        leftImgWidht = array.getDimension(R.styleable.MenuItemView_leftImgWidht, 20f);
        leftImgHeight = array.getDimension(R.styleable.MenuItemView_leftImgHeight, 20f);
        leftImgMarginLeft = array.getDimension(R.styleable.MenuItemView_leftImgMarginLeft, 10f);

        content = array.getString(R.styleable.MenuItemView_content);
        contentSize = array.getDimension(R.styleable.MenuItemView_contentSize, 10f);
        contentMarginLeft = array.getDimension(R.styleable.MenuItemView_contentMarginLeft, 10f);
        contentColor = array.getColor(R.styleable.MenuItemView_contentColor, Color.BLACK);

        showRedPoint = array.getBoolean(R.styleable.MenuItemView_showRedPoint, false);
        redPointSize = array.getDimension(R.styleable.MenuItemView_RedPointSize, 5f);
        redPointColor = array.getColor(R.styleable.MenuItemView_RedPointColor, Color.RED);

        rightImgRes = array.getResourceId(R.styleable.MenuItemView_rightImgRes, 0);
        rightImgWidht = array.getDimension(R.styleable.MenuItemView_rightImgWidht, 20f);
        rightImgHeight = array.getDimension(R.styleable.MenuItemView_rightImgHeight, 20f);
        rightImgMarginRight = array.getDimension(R.styleable.MenuItemView_rightImgMarginRight, 10f);

        spliteLineColor = array.getColor(R.styleable.MenuItemView_spliteLineColor, Color.GRAY);
        spliteLineMarginLeft = array.getDimension(R.styleable.MenuItemView_spliteLineMarginLeft, 0f);
        spliteLineMarginRight = array.getDimension(R.styleable.MenuItemView_spliteLineMarginRight, 0f);
        spliteLineHegiht = array.getDimension(R.styleable.MenuItemView_spliteLineHegiht, 1f);
        showSpliteLine = array.getBoolean(R.styleable.MenuItemView_showSpliteLine, true);

        array.recycle();
        initView();
    }

    public void setShowRedPoint(boolean show) {
        if(rpv_menu_item != null){
            rpv_menu_item.setVisibility(show ? VISIBLE : GONE);
        }
    }

    private void initView() {
        View rootView = View.inflate(getContext(), R.layout.view_menu_item, this);
        iv_menu_item_bottom = (ImageView) rootView.findViewById(R.id.iv_menu_item_bottom);
        iv_menu_item_left = (ImageView) rootView.findViewById(R.id.iv_menu_item_left);
        iv_menu_item_right = (ImageView) rootView.findViewById(R.id.iv_menu_item_right);
        rpv_menu_item = (RedPointView) rootView.findViewById(R.id.rpv_menu_item);
        tv_menu_item_content = (TextView) rootView.findViewById(R.id.tv_menu_item_content);


        if (leftImgRes != 0) {
            iv_menu_item_left.setImageResource(leftImgRes);
            LinearLayout.LayoutParams iv_menu_item_leftlayoutParams = (LinearLayout.LayoutParams) iv_menu_item_left.getLayoutParams();
            iv_menu_item_leftlayoutParams.width = (int) leftImgWidht;
            iv_menu_item_leftlayoutParams.height = (int) leftImgHeight;
            iv_menu_item_leftlayoutParams.setMargins((int) leftImgMarginLeft, 0, 0, 0);
            iv_menu_item_left.setLayoutParams(iv_menu_item_leftlayoutParams);
        } else {
            iv_menu_item_left.setVisibility(GONE);
        }

        tv_menu_item_content.setText(content);
        tv_menu_item_content.setTextSize(px2sp(contentSize));
        tv_menu_item_content.setTextColor(contentColor);
        LinearLayout.LayoutParams tv_menu_item_contentlayoutParams = (LinearLayout.LayoutParams) tv_menu_item_content.getLayoutParams();
        tv_menu_item_contentlayoutParams.setMargins((int) contentMarginLeft, 0, 0, 0);
        tv_menu_item_content.setLayoutParams(tv_menu_item_contentlayoutParams);


        rpv_menu_item.setVisibility(showRedPoint ? VISIBLE : GONE);
        rpv_menu_item.setPointColor(redPointColor);
        LinearLayout.LayoutParams rpv_menu_itemlayoutParams = (LinearLayout.LayoutParams) rpv_menu_item.getLayoutParams();
        rpv_menu_itemlayoutParams.width = (int) redPointSize;
        rpv_menu_itemlayoutParams.height = (int) redPointSize;
        rpv_menu_item.setLayoutParams(rpv_menu_itemlayoutParams);

        if (rightImgRes != 0) {
            iv_menu_item_right.setImageResource(rightImgRes);
            LinearLayout.LayoutParams iv_menu_item_rightlayoutParams = (LinearLayout.LayoutParams) iv_menu_item_right
                    .getLayoutParams();
            iv_menu_item_rightlayoutParams.width = (int) rightImgWidht;
            iv_menu_item_rightlayoutParams.height = (int) rightImgHeight;
            iv_menu_item_rightlayoutParams.setMargins(0, 0, (int) leftImgMarginLeft, 0);
            iv_menu_item_right.setLayoutParams(iv_menu_item_rightlayoutParams);
        } else {
            iv_menu_item_right.setVisibility(GONE);
        }


        if (showSpliteLine) {
            iv_menu_item_bottom.setBackgroundColor(spliteLineColor);
            LinearLayout.LayoutParams iv_menu_item_bottomlayoutParams = (LinearLayout.LayoutParams) iv_menu_item_bottom
                    .getLayoutParams();
            iv_menu_item_bottomlayoutParams.height = (int) spliteLineHegiht;
            iv_menu_item_bottomlayoutParams.setMargins((int) spliteLineMarginLeft, 0, (int) spliteLineMarginRight, 0);
            iv_menu_item_bottom.setLayoutParams(iv_menu_item_bottomlayoutParams);
        } else {
            iv_menu_item_bottom.setVisibility(GONE);
        }

    }

    /**
     * dp转px
     *
     * @param dp
     * @return
     */
    private int dip2px(int dp) {
        float density = getContext().getResources().getDisplayMetrics().density;
        return (int) (dp * density + 0.5);
    }

    /**
     * px转dp
     *
     * @return
     */
    private int px2dip(int px) {
        float density = getContext().getResources().getDisplayMetrics().density;
        return (int) (px / density + 0.5);
    }


    /**
     * convert px to its equivalent sp
     * <p>
     * 将px转换为sp
     */
    private int px2sp( float pxValue) {
        final float fontScale = getContext().getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }
}
