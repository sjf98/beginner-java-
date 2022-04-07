using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace DesktopApp
{
    /// <summary>
    /// Interaction logic for MyUserControl.xaml
    /// </summary>
    public partial class MyUserControl : UserControl
    {
        public MyUserControl()
        {
         
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            //step 1 - get the text from text box, take the text from form of string to user textbox
            string newLine = Environment.NewLine;
            var text =  "Hey! Thank you for your interest in Hey! You can sign up to our platform here, www.ooohey.com" +newLine+ "Once you've signed up and connected your Instagram we'll get in touch when we've found a campaign that suits you!";



            Clipboard.SetText(text);

        }
    }
   
}
